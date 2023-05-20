package com.ecommerce.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.ProviderDetailsDeleteRepository;
import com.ecommerce.service.ProviderDetailsDeleteService;

@Service
public class ProviderDetailsDeleteImpl implements ProviderDetailsDeleteService {

	@Autowired
	private ProviderDetailsDeleteRepository providerDetailsDeleteRepository;

	@Override
	public void deleteProviderDetails(Integer id) {
		providerDetailsDeleteRepository.deleteById(id);
	}

}
