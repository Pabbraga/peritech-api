package com.pabbraga.peritech.resources;

import com.pabbraga.peritech.entities.Product;
import com.pabbraga.peritech.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Predicate;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @CrossOrigin(origins = "*")
    @GetMapping
    public ResponseEntity<List<Product>> findAll(@RequestParam(defaultValue = "16") int limit, @RequestParam(defaultValue = "0") int offset, @RequestParam String category) {
        List<Product> list = service.findAll(limit, offset);

        if (!category.equals("null")) {
            Predicate<Product> filterByCategory = product -> product.getCategory().equals(category);
            list = list.stream().filter(filterByCategory).toList();
        }

        return ResponseEntity.ok().body(list);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
