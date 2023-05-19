package com.ecommerce.model;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
/*
 * Task No.115
 * Design Restful web service which is used to update category with product details into database
 * By - Vaishali Kadam
 */

@Entity
@Table(name = "category")
public class CategoryUpdate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String categoryName;
	private String description;
	
	//one category has multiple products
	@OneToMany(mappedBy = "categoryId")
	private List<ProductUpdate> productList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ProductUpdate> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductUpdate> productList) {
		this.productList = productList;
	}

	

}
