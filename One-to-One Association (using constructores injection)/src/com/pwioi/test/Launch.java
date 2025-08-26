package com.pwioi.test;
import com.pwioi.entites.*;
public class Launch {

	public static void main(String[] args) {
		Account a=new Account(123,"current","Munaf");
		Employee e = new Employee(123,"Munaf","Hyderabad",a);
		

		
		System.out.println(e);

	}

}
