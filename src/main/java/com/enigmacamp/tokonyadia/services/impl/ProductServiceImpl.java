package com.enigmacamp.tokonyadia.services.impl;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import com.enigmacamp.tokonyadia.entity.Product;
import com.enigmacamp.tokonyadia.repository.ProductRepository;
import com.enigmacamp.tokonyadia.services.ProductServices;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductServices {
    ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product) {
        String productId = "product-"+ NanoIdUtils.randomNanoId();
        System.out.println(productId);
        product.setId(productId);
        return productRepository.save(product);
    }

    @Override
    public Product getProductbyId(String id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getAllProducts(boolean delete) {
        return productRepository.findAll();
    }

    @Override
    public Product updateProductbyId(Product product) {
        if(productRepository.findById(product.getId()).isPresent()){
            return productRepository.save(product);
        }else{
            throw new RuntimeException("Product with id: "+product.getId()+" not found!");
        }
    }

    @Override
    public void deleteProductbyId(String id) {
        if(productRepository.existsById(id)){
            productRepository.delete(productRepository.getReferenceById(id));
            //productRepository.deleteById(id);
        }else{
            throw new RuntimeException("Product with id: "+id+" not found!");
        }
    }
}