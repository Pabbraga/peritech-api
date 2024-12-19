package com.pabbraga.peritech.repositories;

import com.pabbraga.peritech.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
