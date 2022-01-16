package com.example.feignclientexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ProductServiceClient productServiceClient;

    @GetMapping("/fetchProducts")
    public ResponseEntity <List<Product>> fetchProducts() {
        return ResponseEntity.ok(productServiceClient.getAllProducts());
    }

    @GetMapping("/fetchProduct/{id}")
    public ResponseEntity<Product> fetchProduct(@PathVariable int id) {
        return ResponseEntity.ok(productServiceClient.getProduct(id));
    }
}
