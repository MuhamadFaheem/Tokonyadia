package com.enigmacamp.tokonyadia.services;

import com.enigmacamp.tokonyadia.entity.Product;

import java.util.List;

public interface ProductServices {
    Product saveProduct(Product product);
    Product getProductbyId(String id);
    List<Product> getAllProducts(boolean delete);
    Product updateProductbyId(Product product);
    void deleteProductbyId(String id);


}