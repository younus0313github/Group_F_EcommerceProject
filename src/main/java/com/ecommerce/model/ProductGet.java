package com.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

/*
 * Task No.116
 * Design Restful web service which is used to get category with product details from database
 * By - Younus K Shaikh
 */

@Entity
@Table(name = "Product")
public class ProductGet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productName;
	private String productsPrice;

	@JoinColumn(name = "category_id")
	private int categoryId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductsPrice() {
		return productsPrice;
	}

	public void setProductsPrice(String productsPrice) {
		this.productsPrice = productsPrice;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
}
