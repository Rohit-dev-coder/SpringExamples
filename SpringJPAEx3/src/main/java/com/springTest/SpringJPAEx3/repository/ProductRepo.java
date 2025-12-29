package com.springTest.SpringJPAEx3.repository;

import com.springTest.SpringJPAEx3.models.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProductRepo {

    @PersistenceContext
    private EntityManager entityManager;

    public ProductRepo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public void addProduct(Product newProd) {
        entityManager.persist(newProd);
    }

    public Product findProductById(int id) {
        return entityManager.find(Product.class, id);
    }

    public void updateProduct(Product existingPrd) {
        entityManager.merge(existingPrd);
    }

    public void deleteProduct(int id) {
        Product prdToDelete = entityManager.find(Product.class, id);
        if (prdToDelete != null) {
            entityManager.remove(prdToDelete);
        }
    }

    public List<Product> findAllProducts() {
        Query query = entityManager.createQuery("SELECT p FROM Product p");
        return query.getResultList();
    }

    public List<Product> findProductsByName(String name) {
        Query query = entityManager.createQuery("SELECT p FROM Product p WHERE p.name = :name");
        query.setParameter("name", name);
        return query.getResultList();
    }

    public List<Product> findProductsByPriceRange(double minPrice, double maxPrice) {
        Query query = entityManager.createQuery("SELECT p FROM Product p WHERE p.price BETWEEN :minPrice AND :maxPrice");
        query.setParameter("minPrice", minPrice);
        query.setParameter("maxPrice", maxPrice);
        return query.getResultList();
    }

    public List<Product> findProductsByQuantityBelowThreshold(int threshold) {
        Query query = entityManager.createQuery("SELECT p FROM Product p WHERE p.quantity < :threshold");
        query.setParameter("threshold", threshold);
        return query.getResultList();
    }
}
