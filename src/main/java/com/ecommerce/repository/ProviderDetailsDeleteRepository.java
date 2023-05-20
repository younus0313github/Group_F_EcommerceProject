package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.model.ProviderDetailsDelete;

@Repository
public interface ProviderDetailsDeleteRepository extends JpaRepository<ProviderDetailsDelete, Integer> {

}
