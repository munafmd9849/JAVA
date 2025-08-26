package com.pwioi.entites;

public class Charger {
	private String brand;
	private int voltage;
	public String getBrand() {
		return brand;
	}
	public int getVoltage() {
		return voltage;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public Charger(String brand, int voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}

}
