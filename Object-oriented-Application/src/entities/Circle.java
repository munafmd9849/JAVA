package entities;

import java.util.Scanner;

public class Circle extends Shape{
	private float radius;
	public void acceptInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("plz enter the length of radius of circle");
		radius=scan.nextFloat();
		
	}
	public void compute() {
		area=3.141f*radius*radius;
	}
}
