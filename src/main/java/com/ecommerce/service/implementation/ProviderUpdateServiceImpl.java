package com.ecommerce.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.model.ProviderUpdate;
import com.ecommerce.repository.ProviderUpdateRepository;
import com.ecommerce.service.ProviderUpdateService;

@Service
public class ProviderUpdateServiceImpl implements ProviderUpdateService {

	@Autowired
	private ProviderUpdateRepository providerRepository;
	
	@SuppressWarnings("deprecation")
	@Override
	public ProviderUpdate updateProviderDetails(ProviderUpdate provider, Integer id) {
		
		if (providerRepository.findById(id).isPresent()) {
		ProviderUpdate prd=providerRepository.getById(id);
		prd.setPid(provider.getPid());
		prd.setProviderCode(provider.getProviderCode());
		prd.setProviderName(provider.getProviderName());
		prd.setPeople(provider.getPeople());
		prd.setPhone(provider.getPhone());
		prd.setAddress(provider.getAddress());
		prd.setFax(provider.getFax());
		prd.setPdescription(provider.getPdescription());
		prd.setCreateDate(provider.getCreateDate());
		
		
		ProviderUpdate updatedprovider=providerRepository.save(prd);
		return updatedprovider;
		}
		else {
			return null;
		}
	}

}
