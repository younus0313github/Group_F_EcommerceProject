package com.velocity.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.ProductDetail;
import com.velocity.repository.ProductDetailRepository;
import com.velocity.service.ProductDetailService;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {

	
	//inject repository reference
	@Autowired
	private ProductDetailRepository productDetailRepository;
	@Override
	public ProductDetail getProductDetailById(Integer id) {
		ProductDetail productDetail=productDetailRepository.findById(id);
		return productDetail;
	}
	
	

	
	
	
	
	
	
	
	
	
}


