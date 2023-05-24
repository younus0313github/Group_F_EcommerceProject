package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.ProductGet;

@Repository
public interface ProductGetRepository extends JpaRepository<ProductGet, Integer> {

}
