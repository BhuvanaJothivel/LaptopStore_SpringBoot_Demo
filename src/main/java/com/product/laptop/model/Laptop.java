package com.product.laptop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "laptop_table")
public class Laptop {
	@Id
	private int laptopId;
//	@Column(name = "brand")
	private String brandName;
	private int ramSize;
	private int price;
	public Laptop(int laptopId, String brandName, int ramSize, int price) {
		super();
		this.laptopId = laptopId;
		this.brandName = brandName;
		this.ramSize = ramSize;
		this.price = price;
	}
	public Laptop() {
		super();
	}
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
