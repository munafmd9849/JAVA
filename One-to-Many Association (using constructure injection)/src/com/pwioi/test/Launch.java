package com.pwioi.test;
import com.pwioi.entites.*;
public class Launch {

	public static void main(String[] args) {
		Employee [] arr=new Employee [3];
		 arr[0]=new Employee(1,"shashi");
		 arr[1]=new Employee(2,"munaf");
		 arr[2]=new Employee(3,"Irfan");
		 
		 Department d= new Department("898","BCCI","Shah","Dubai",arr);
		
		 System.out.println(d);
		

	}

}
