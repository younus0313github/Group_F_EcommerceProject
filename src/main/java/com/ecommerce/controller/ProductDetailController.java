package com.velocity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.ProductDetail;
import com.velocity.service.ProductDetailService;

@RestController
public class ProductDetailController {

	// Inject the service here
	@Autowired
	private ProductDetailService productDetailService;

	@GetMapping("/AddProduct/{id}")
	public ResponseEntity<ProductDetail> getProductDetailById(@PathVariable("id") Integer id) { // id contain 2
		// calling method
		ProductDetail productDetail = productDetailService.getProductDetailById(id); // 2
		return ResponseEntity.ok().body(productDetail);
	}

}
