package entities;

import java.util.Scanner;

public class Rectangle  extends Shape{
	private float length;
	private float breadth;
	public void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("plz enter the length of rectangle");
		length=scan.nextFloat();
		System.out.println("plz enter the breadth of rectangle");
		breadth=scan.nextFloat();
		
	}
	public void compute() {
		area=breadth*length;
	}
}
