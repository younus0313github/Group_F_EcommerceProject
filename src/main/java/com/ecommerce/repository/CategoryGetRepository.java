package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.CategoryGet;

@Repository
public interface CategoryGetRepository extends JpaRepository<CategoryGet, Integer>{

}
