package com.pwioi.entities;

import com.pwioi.agrigate_entities.Bike;
import com.pwioi.agrigate_entities.Book;
import com.pwioi.composite_entities.Brain;
import com.pwioi.composite_entities.Heart;

public class Student {
	private String name;
	private int rollNo;
	public Bike bike;
	public Book book;
	
	public Brain brain=new Brain("grey",1000);
	public Heart heart=new Heart(73,400);
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public void setBrain(Brain brain) {
		this.brain = brain;
	}
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	
	

}
