package com.boot.repo.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.config.model.product.Product;

public interface IProductRepository extends JpaRepository<Product, Integer> {

}
