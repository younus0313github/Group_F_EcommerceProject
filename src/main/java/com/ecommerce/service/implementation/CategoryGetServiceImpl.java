package com.ecommerce.service.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.CategoryGet;
import com.ecommerce.repository.CategoryGetRepository;
import com.ecommerce.service.CategoryGetService;

@Service
public class CategoryGetServiceImpl implements CategoryGetService{
	
	@Autowired
	private CategoryGetRepository categoryGetRepository;

	@Override
	public CategoryGet getCategoryById(Integer Id) {
		Optional<CategoryGet> o=categoryGetRepository.findById(Id);
		return null;
	}

}
