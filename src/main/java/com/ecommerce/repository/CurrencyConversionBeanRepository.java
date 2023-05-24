package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.CurrencyConversionBean;

@Repository
public interface CurrencyConversionBeanRepository extends JpaRepository<CurrencyConversionBean,Long> {
	
		
}

