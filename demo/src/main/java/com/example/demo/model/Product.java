package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description="Model class to hold the Product details!")
public class Product {

	@Id
	@ApiModelProperty(notes="ID of the product")
	private Long id;
	private String name;
	private String category;
	private Double retail_price;
	private Double discounted_price;
	private boolean availabilty;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getRetail_price() {
		return retail_price;
	}
	public void setRetail_price(Double retail_price) {
		this.retail_price = retail_price;
	}
	public Double getDiscounted_price() {
		return discounted_price;
	}
	public void setDiscounted_price(Double discounted_price) {
		this.discounted_price = discounted_price;
	}
	public boolean isAvailabilty() {
		return availabilty;
	}
	public void setAvailabilty(boolean availabilty) {
		this.availabilty = availabilty;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", retail_price=" + retail_price
				+ ", discounted_price=" + discounted_price + ", availabilty=" + availabilty + "]";
	}
}
