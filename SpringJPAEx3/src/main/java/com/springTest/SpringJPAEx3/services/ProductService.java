package com.springTest.SpringJPAEx3.services;

import com.springTest.SpringJPAEx3.models.Product;
import com.springTest.SpringJPAEx3.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepo repo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.repo = productRepo;
    }

    public void addProduct() {
        String name = System.console().readLine("Name: ");
        String description = System.console().readLine("Description: ");
        int quantity = Integer.parseInt(System.console().readLine("Quantity: "));
        double price = Double.parseDouble(System.console().readLine("Price: "));
        Product newPrd = new Product();
        newPrd.setName(name);
        newPrd.setDescription(description);
        newPrd.setQuantity(quantity);
        newPrd.setPrice(price);
        repo.addProduct(newPrd);
    }

    public void updateProduct() {
        int id = Integer.parseInt(System.console().readLine("Product ID to update: "));
        Product existingPrd = repo.findProductById(id);
        if (existingPrd != null) {
            String name = System.console().readLine("New Name (" + existingPrd.getName() + "): ");
            String description = System.console().readLine("New Description (" + existingPrd.getDescription() + "): ");
            int quantity = Integer.parseInt(System.console().readLine("New Quantity (" + existingPrd.getQuantity() + "): "));
            double price = Double.parseDouble(System.console().readLine("New Price (" + existingPrd.getPrice() + "): "));
            existingPrd.setName(name.isEmpty() ? existingPrd.getName() : name);
            existingPrd.setDescription(description.isEmpty() ? existingPrd.getDescription() : description);
            existingPrd.setQuantity(quantity);
            existingPrd.setPrice(price);
            repo.updateProduct(existingPrd);
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public void deleteProduct() {
        int id = Integer.parseInt(System.console().readLine("Product ID to delete: "));
        Product existingPrd = repo.findProductById(id);
        if (existingPrd != null) {
            repo.deleteProduct(id);
            System.out.println("Product with ID " + id + " deleted.");
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public void searchAllProducts() {
        List<Product> products = repo.findAllProducts();
        System.out.println("Total Products: " + products.size());
        products.forEach(System.out::println);
    }

    public void searchProductsByName() {
        String name = System.console().readLine("Enter product name to search: ");
        List<Product> products = repo.findProductsByName(name);
        products.forEach(System.out::println);
    }

    public void searchProductsByPriceRange() {
        double minPrice = Double.parseDouble(System.console().readLine("Enter minimum price: "));
        double maxPrice = Double.parseDouble(System.console().readLine("Enter maximum price: "));
        List<Product> products = repo.findProductsByPriceRange(minPrice, maxPrice);
        products.forEach(System.out::println);
    }

    public void searchProductsByQuantityBelowThreshold() {
        int threshold = Integer.parseInt(System.console().readLine("Enter quantity threshold: "));
        List<Product> products = repo.findProductsByQuantityBelowThreshold(threshold);
        products.forEach(System.out::println);
    }
}
