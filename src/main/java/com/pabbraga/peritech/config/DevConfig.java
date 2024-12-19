package com.pabbraga.peritech.config;

import com.pabbraga.peritech.entities.Product;
import com.pabbraga.peritech.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile(value = "dev")
public class DevConfig implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Product p1 = new Product(null, "Fone De Ouvido Headphone Multilaser Preto Pop Ph246", "Lorem ipsum dolor sit amet, consectetur.", 69.30, 0, "");
        productRepository.save(p1);

    }

}
