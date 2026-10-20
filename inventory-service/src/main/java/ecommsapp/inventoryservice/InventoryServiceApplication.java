package ecommsapp.inventoryservice;

import ecommsapp.inventoryservice.entities.Product;
import ecommsapp.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder().name("Computer").price(8000).quantity(12).build());
            productRepository.save(Product.builder().name("Printer").price(1200).quantity(5).build());
            productRepository.save(Product.builder().name("Smartphone").price(4000).quantity(20).build());
        };
    }
}