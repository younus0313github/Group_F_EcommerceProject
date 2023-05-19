package com.ecommerce.service.implementation;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.model.CategoryUpdate;
import com.ecommerce.repository.CategoryUpdateRepository;
import com.ecommerce.service.CategoryUpdateService;

@Service
public class CategoryUpdateServiceImpl implements CategoryUpdateService {

	@Autowired
	private CategoryUpdateRepository categoryRepository;

	@Override
	public CategoryUpdate updateCategory(CategoryUpdate category, int id) {

		Optional<CategoryUpdate> optional = categoryRepository.findById(id);
		CategoryUpdate ctg = optional.get();
		ctg.setCategoryName(category.getCategoryName());
		ctg.setDescription(category.getDescription());

		CategoryUpdate updatedCategory = categoryRepository.save(ctg);
		return updatedCategory;

	}

}
