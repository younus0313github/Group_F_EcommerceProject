package com.velocity.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*Task No 144
 * Design Restful which is used to store category with product details into database
 * By - Amit waghmare
 */

@Entity
@Table(name = "category")

public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long cartId;
	private String image;
	private String title;
	private int quantity;
	private double price;

	@OneToMany(mappedBy = "categoryId")
	private List<Product> productList;

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
