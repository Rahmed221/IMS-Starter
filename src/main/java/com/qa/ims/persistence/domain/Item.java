package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Item {
	int id;
	String name;
	int product_id;
	String stock;

// data into the inventory database
	public Item(String name, int product_id, String stock) {
		super();
		this.name = name;
		this.product_id = product_id;
		this.stock = stock;

	}
// pulling data from SQL 
	public Item(int id, String name, int product_id, String stock) {
		super();
		this.id = id;
		this.name = name;
		this.product_id = product_id;
		this.stock = stock;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, product_id, stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return id == other.id && Objects.equals(name, other.name) && product_id == other.product_id
				&& Objects.equals(stock, other.stock);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

}
