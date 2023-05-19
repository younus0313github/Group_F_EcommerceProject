package com.ecommerce.service.implementation;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.model.ProductUpdate;
import com.ecommerce.repository.ProductUpdateRepository;
import com.ecommerce.service.ProductUpdateService;

@Service
public class ProductUpdateServiceImpl implements ProductUpdateService {

	@Autowired
	private ProductUpdateRepository productRepository;

	@Override
	public ProductUpdate updateProduct(ProductUpdate product, int id) {
		
		Optional<ProductUpdate> optional=productRepository.findById(id);
		ProductUpdate prd =optional.get();
		prd.setpName(product.getpName());
		prd.setpPrice(product.getpPrice());
		
		ProductUpdate updatedProduct = productRepository.save(prd);
		return updatedProduct;
		
		
	}

}
