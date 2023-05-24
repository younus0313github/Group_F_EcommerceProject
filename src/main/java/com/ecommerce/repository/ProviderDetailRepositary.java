package com.example.repositary;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ProviderDetail;

@Repository
public interface ProviderDetailRepositary extends JpaRepository<ProviderDetail, Serializable>{
	

}
