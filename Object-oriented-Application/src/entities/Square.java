package entities;

import java.util.Scanner;

public class Square extends Shape {
	
	private float length;
	public void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("plz enter the length of square side");
		length=scan.nextFloat();
		
	}
	public void compute() {
		area=length*length;
	}
	
}
