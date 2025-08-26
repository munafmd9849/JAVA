package com.pwioi.composite_entities;

public class Brain {
	private String color;
	public String getColor() {
		return color;
	}
	public int getWeight() {
		return weight;
	}
	public Brain(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	private int weight;
	public void setColor(String color) {
		this.color = color;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
