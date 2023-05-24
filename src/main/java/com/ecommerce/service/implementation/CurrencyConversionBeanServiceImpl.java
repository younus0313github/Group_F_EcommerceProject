package com.velocity.ServiceImplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.CurrencyConversionBean;
import com.velocity.repository.CurrencyConversionBeanRepository;
import com.velocity.service.CurrencyConversionBeanService;
/*Task No 97
 * By - Amit waghmare
 */

@Service
public class CurrencyConversionBeanServiceImpl implements CurrencyConversionBeanService  {

	@Autowired
	private CurrencyConversionBeanRepository currencyConversionBeanRepository;
	
	// Get CurrencyConversionBean Details
	
	@Override
	public CurrencyConversionBean getCurrentConverterDetails(Long id) {
		Optional<CurrencyConversionBean> optinal=currencyConversionBeanRepository.findById(id);
		CurrencyConversionBean currencyConversionBean=optinal.get();
		return currencyConversionBean;
	}

	// Delete CurrencyConversionBean Details
	@Override
	public void deleteCurrentConverterDetails(Long id) {
		
		currencyConversionBeanRepository.deleteById(id);
		
	}

}
