package com.pabbraga.peritech.services;

import com.pabbraga.peritech.entities.Product;
import com.pabbraga.peritech.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(int limit, int offset) {
        Page<Product> page = repository.findAll(PageRequest.of(offset, limit));

        return page.get().toList();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
