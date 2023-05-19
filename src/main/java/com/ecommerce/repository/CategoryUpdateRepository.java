package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.model.CategoryUpdate;

@Repository
public interface CategoryUpdateRepository extends JpaRepository<CategoryUpdate, Integer>  {

}
