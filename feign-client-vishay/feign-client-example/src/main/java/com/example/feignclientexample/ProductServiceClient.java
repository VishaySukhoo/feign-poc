package com.example.feignclientexample;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//Spring will make out the implementation of this interface at runtime using feign
@FeignClient(name = "product-service")
//dont need url if registered with eureka as ProductServiceClient will use the name
// (product-service) to fetch the url from eureka
//        , url = "http://localhost:8081")
    interface ProductServiceClient {

        @RequestMapping(value = "/products", method = RequestMethod.GET)
        public List<Product> getAllProducts();

        @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
        public Product getProduct(@PathVariable("id") int productId);

    }

