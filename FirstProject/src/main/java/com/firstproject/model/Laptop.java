package com.firstproject.model;

import org.springframework.stereotype.Component;

@Component("lappy")
public class Laptop {

	public Laptop() {
		super();
		System.out.println("Laptop object created...");
	}

	private int id;
	private String brand;
	private String owner;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void compileLaptop() {
		System.out.println("Compiling laptop...");
	}
}
