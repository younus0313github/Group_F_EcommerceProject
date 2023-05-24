package com.ecommerce.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/*
 * Task No.116
 * Design Restful web service which is used to get category with product details from database
 * By - Younus K Shaikh
 */

//one category has many Products

@Entity
@Table(name = "category")
public class CategoryGet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String categotyName;
	
	@OneToMany(mappedBy = "categoryId")
	private List<ProductGet> productList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategotyName() {
		return categotyName;
	}

	public void setCategotyName(String categotyName) {
		this.categotyName = categotyName;
	}

	public List<ProductGet> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductGet> productList) {
		this.productList = productList;
	}
	
	

}
