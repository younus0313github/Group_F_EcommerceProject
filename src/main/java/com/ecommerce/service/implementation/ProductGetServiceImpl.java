package com.ecommerce.service.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.ProductGet;
import com.ecommerce.repository.ProductGetRepository;
import com.ecommerce.service.ProductGetService;

@Service
public class ProductGetServiceImpl implements ProductGetService {

	@Autowired
	private ProductGetRepository productGetRepository;

	@Override
	public ProductGet getProductById(Integer id) {
		Optional op=productGetRepository.findById(id);
		return null;
	}

}
