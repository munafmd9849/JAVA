package com.pwioi.entites;

public class Mobile {
	private int price;
	private String processor;
	
	public OperatingSystem os=new OperatingSystem("mac",512);
	public Charger c;
	

	public void setPrice(int price) {
		this.price = price;
	}


	public void setProcessor(String processor) {
		processor = processor;
	}

	public void setOs(OperatingSystem os) {
		this.os = os;
	}

	public void setC(Charger c) {
		this.c = c;
	}


	public Mobile(int price, String processor) {
		super();
		this.price = price;
		this.processor = processor;
	}}
