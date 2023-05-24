package com.velocity.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Product;
import com.velocity.repository.ProductRepository;
import com.velocity.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
private ProductRepository productRepository;
	@Override
	public Product saveProduct(Product product) {
		Product products = productRepository.save(product);
		return products;
	}
}
