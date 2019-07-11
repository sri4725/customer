package com.sreedhar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class ProductEntity {
	@Id
	@Column(name = "Product_Id")
	private String ProductId;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Type")
	private String Type;
	@Column(name = "Price")
	private long price;
	@Column(name = "Quantity")
	private int Quantity;
	@Column(name = "Is_Available")
	private String IsAvailable;

	public ProductEntity() {

		// TODO Auto-generated constructor stub
	}

	public String getProductId() {
		return ProductId;
	}

	public void setProductId(String productId) {
		ProductId = productId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getIsAvailable() {
		return IsAvailable;
	}

	public void setIsAvailable(String isAvailable) {
		IsAvailable = isAvailable;
	}

}
