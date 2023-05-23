package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ecommerce.model.ReimbursementDelete;

@Repository
public interface ReimbursementDeleteRepository extends CrudRepository<ReimbursementDelete, Serializable> {

}
