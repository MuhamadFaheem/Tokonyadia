package com.enigmacamp.tokonyadia.controller;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import com.enigmacamp.tokonyadia.entity.Product;
import com.enigmacamp.tokonyadia.repository.ProductRepository;
import com.enigmacamp.tokonyadia.services.ProductServices;
import com.enigmacamp.tokonyadia.services.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/productAPI/v1/products")
public class ProductController{
    ProductServices productServices;
    @Autowired
    public ProductController(ProductServices ps){
        this.productServices=ps;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "Route is working!";
    }
    @PostMapping(value = "/add")
    public Product saveProduct(@RequestBody Product product){
        return productServices.saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productServices.getAllProducts(true);
    }

    @GetMapping("/{id}")
    public Product getproductbyId(@PathVariable String id){
        return productServices.getProductbyId(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable String id){
        productServices.deleteProductbyId(id);
        return ResponseEntity.accepted().build().toString();
    }

    @PutMapping("/update/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable String id){
        productServices.updateProductbyId(product);
    }
}