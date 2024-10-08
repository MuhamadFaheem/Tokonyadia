package com.enigmacamp.tokonyadia.repository;

import com.enigmacamp.tokonyadia.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;


@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}