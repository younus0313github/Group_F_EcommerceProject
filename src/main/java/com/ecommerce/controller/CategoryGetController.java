package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.CategoryGet;
import com.ecommerce.model.ProductGet;
import com.ecommerce.service.CategoryGetService;
import com.ecommerce.service.ProductGetService;

@RestController
@RequestMapping(value = "/Category")
public class CategoryGetController {

	@Autowired
	private CategoryGetService categoryGetService;

	@Autowired
	private ProductGetService productGetService;

	@GetMapping("/Get/{id}")
	public ResponseEntity<CategoryGet> getCategoryById(@PathVariable("Id") Integer Id) throws Exception {
		CategoryGet cg = categoryGetService.getCategoryById(Id);
		List<ProductGet> products = cg.getProductList();
		for (ProductGet p : products) {
			p.setCategoryId(cg.getId());
		}
		return ResponseEntity.ok().body(cg);

	}
}
