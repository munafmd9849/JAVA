package com.pwioi.test;
import com.pwioi.agrigate_entities.Bike;
import com.pwioi.agrigate_entities.Book;
import com.pwioi.entities.Student;

public class Launch {

	public static void main(String[] args) {
		Bike bike=new Bike(30,"BMW");
		Book book=new Book("rakesh","who");
		Student s=new Student("Manas",133);
		s.setBike(bike);
		s.setBook(book);
		System.out.println(s.bike.getBrand());
		System.out.println(s.bike.getMilage());
		System.out.println(s.book.getAuthor());
		System.out.println(s.book.getTitle());
		System.out.println(s.heart.getHeartBeats());
		System.out.println(s.heart.getHeartBeats());
		System.out.println(s.brain.getColor());
		System.out.println(s.brain.getWeight());
		s=null;
		System.out.println(s.bike.getBrand());
		System.out.println(s.bike.getMilage());
		System.out.println(s.book.getAuthor());
		System.out.println(s.book.getTitle());
		System.out.println(s.heart.getHeartBeats());
		System.out.println(s.heart.getHeartBeats());
		System.out.println(s.brain.getColor());
		System.out.println(s.brain.getWeight());
		System.out.println(bike.getBrand());
		System.out.println(bike.getMilage());
		System.out.println(book.getAuthor());
		System.out.println(book.getTitle());
		
 
	}

}
