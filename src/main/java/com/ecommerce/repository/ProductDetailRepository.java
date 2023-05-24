package com.velocity.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.ProductDetail;

@Repository
public interface ProductDetailRepository extends CrudRepository<ProductDetail, Serializable> {
	
	public ProductDetail findById(Integer id);

}
