package com.velocity.ServiceImplementation;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.velocity.model.Category;
import com.velocity.repository.CategoryRepository;
import com.velocity.service.CategoryService;
import com.velocity.service.ProductService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public Category saveCategory(Category category) {
		Category categoryes = categoryRepository.save(category);
		return categoryes;
	}
	}
 
	

	
	
	
	
	
	
	
	
	



