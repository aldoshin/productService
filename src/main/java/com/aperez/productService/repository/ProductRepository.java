package com.aperez.productService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aperez.productService.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}