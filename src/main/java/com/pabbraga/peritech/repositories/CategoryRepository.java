package com.pabbraga.peritech.repositories;

import com.pabbraga.peritech.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
