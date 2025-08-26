package com.pwioi.agrigate_entities;

public class Book {
	private String author;
	private String title;
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	public Book(String author, String title) {
		super();
		this.author = author;
		this.title = title;
	}
}
