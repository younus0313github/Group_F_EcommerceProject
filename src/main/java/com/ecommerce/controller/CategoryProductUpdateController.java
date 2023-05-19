package com.ecommerce.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerce.model.CategoryUpdate;
import com.ecommerce.model.ProductUpdate;
import com.ecommerce.service.CategoryUpdateService;
import com.ecommerce.service.ProductUpdateService;

/*Task No 115
 * Design Restful web service to update category with product details
 * By - Vaishali Kadam
 */

@RestController
@RequestMapping(path = "/category")
public class CategoryProductUpdateController {
	
	// Inject the service here
	@Autowired
	private CategoryUpdateService categoryService;
	
	@Autowired
	private ProductUpdateService productService;
	
	// Design the Restful web service to update category with product details

	@PutMapping("/update/{id}")
	public ResponseEntity<CategoryUpdate> updateCategory(@RequestBody CategoryUpdate category, @PathVariable ("id") int id) {
		CategoryUpdate c=categoryService.updateCategory(category, id);
	    List<ProductUpdate> products =category.getProductList();
	    for(ProductUpdate p :products) {
	    	p.setCategoryId(category.getId());
	    	productService.updateProduct(p,id);
		
	    }
		return ResponseEntity.ok().body(c);
	
}
}
