package com.springTest.SpringJPAEx3;

import com.springTest.SpringJPAEx3.services.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaEx3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringJpaEx3Application.class, args);

		while (true){
			System.out.println("================= Product Management System =================");
			System.out.println("1. Add Product");
			System.out.println("2. Update Product");
			System.out.println("3. Delete Product");
			System.out.println("4. Search All Products");
			System.out.println("5. Search Products by Name");
			System.out.println("6. Search Products by Price Range");
			System.out.println("7. Search Products by Quantity Below Threshold");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");
			int choice = Integer.parseInt(System.console().readLine());
			if (choice == 8) {
				System.out.println("Exiting...");
				break;
			}

			ProductService productService = (ProductService) container.getBean(ProductService.class);

			switch (choice) {
				case 1:
					System.out.println("Adding a new product...");
					productService.addProduct();
					break;
				case 2:
					System.out.println("Updating a product...");
					productService.updateProduct();
					break;
				case 3:
					System.out.println("Deleting a product...");
					productService.deleteProduct();
					break;
				case 4:
					System.out.println("Searching all products...");
					productService.searchAllProducts();
					break;
				case 5:
					System.out.println("Searching products by name...");
					productService.searchProductsByName();
					break;
				case 6:
					System.out.println("Searching products by price range...");
					productService.searchProductsByPriceRange();
					break;
				case 7:
					System.out.println("Searching products by quantity below threshold...");
					productService.searchProductsByQuantityBelowThreshold();
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
			System.out.println("Please Enter to continue...");
			System.console().readLine();
		}


	}

}
