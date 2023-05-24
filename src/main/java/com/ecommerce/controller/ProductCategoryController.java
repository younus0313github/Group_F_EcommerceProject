package com.velocity.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.velocity.model.Category;
import com.velocity.model.Product;
import com.velocity.service.CategoryService;
import com.velocity.service.ProductService;

@RestController

public class ProductCategoryController {

	// inject both service here

	@Autowired
	private ProductService productService;

	@Autowired
	private CategoryService categoryService;


@PostMapping("/saveProductCategory")
	public Category saveProductCategory(@RequestBody Category category) {
		Category categories=categoryService.saveCategory(category);
		List<Product> products = category.getProductList();
		for (Product p : products) {
			p.setCategoryId(category.getId());
			productService.saveProduct(p);
		}
		return categories;

	}
}
