package test;

import entities.*;

public class Launch {
	public static void main(String [] args) {
		
		
		Dog dc=new DogChild();
		dc.bark();  //nonstatic
		dc.eat(); //static
	}
	
}
