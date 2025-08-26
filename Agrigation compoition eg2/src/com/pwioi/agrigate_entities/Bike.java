package com.pwioi.agrigate_entities;

public class Bike {
	int milage;
	String brand;
	public Bike(int milage, String brand) {
		super();
		this.milage = milage;
		this.brand = brand;
	}
	public int getMilage() {
		return milage;
	}
	public String getBrand() {
		return brand;
	}
	
}
