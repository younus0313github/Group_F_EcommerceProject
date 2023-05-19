package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.model.ProviderUpdate;


@Repository
public interface ProviderUpdateRepository extends JpaRepository<ProviderUpdate, Integer>  {

}
