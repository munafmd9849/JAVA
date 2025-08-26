package com.pwioi.entites;

public class OperatingSystem {
	private String name;
	private int size;

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public OperatingSystem(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
}
