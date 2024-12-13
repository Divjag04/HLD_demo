package com.example.demo.controllers;

import com.example.demo.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        Product product = new Product();
        product.setId(2L);
        product.setName("Iphone");
        List<Product> products = new ArrayList<>();
        products.add(product);
        return  products;
    }


    @GetMapping("/products/{productId}")
    public Product findProductById(@PathVariable Long productId) {
        Product product = new Product();
        product.setId(productId);
        return product;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return product;
    }
}
