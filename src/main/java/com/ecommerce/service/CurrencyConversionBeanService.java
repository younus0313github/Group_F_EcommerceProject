package com.velocity.service;

import com.velocity.model.CurrencyConversionBean;


public interface CurrencyConversionBeanService {
	
	
	//Get CurrencyConversionBean Details
	
	public CurrencyConversionBean getCurrentConverterDetails(Long id);
	
	//Delete CurrencyConversionBean Details
	
	public void deleteCurrentConverterDetails(Long id);
	
	

}
