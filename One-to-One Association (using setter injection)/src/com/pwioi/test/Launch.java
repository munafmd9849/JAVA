package com.pwioi.test;
import com.pwioi.entites.*;
public class Launch {

	public static void main(String[] args) {
		Account a=new Account();
		a.setAccName("Snuhith");
		a.setAccNo(9839);
		a.setAccType("savings");
		Employee e = new Employee();
		e.setAdder(a);
		e.setEmpAddr("warangal");
		e.setEmpId(0);
		e.setEmpName("Snuhith");
		
	
		System.out.println(e);

	}

}
