/**
 * 
 */
package com.restapi.crud.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author AR
 *
 */
@Entity
public class Product {
	@Id
	private Integer id;
	private String name;
	private float price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Product() {
		super();
	}

	public Product(Integer id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
