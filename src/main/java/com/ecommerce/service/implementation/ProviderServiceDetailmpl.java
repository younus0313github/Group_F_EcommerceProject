package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.ProviderDetail;
import com.example.repositary.ProviderDetailRepositary;

@Service
public class ProviderServiceDetailmpl implements ProviderDetailService {
 @Autowired
	private ProviderDetailRepositary providerDetailRepositary;
 
	@Override
	public ProviderDetail SaveProviderDetails(ProviderDetail providerDetail) {
		ProviderDetail providerDetail2=providerDetailRepositary.save(providerDetail);
		return providerDetail2;
	}

}
