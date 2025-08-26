package com.pwioi.test;
import java.util.Arrays;

import com.pwioi.entites.*;
public class Launch {

	public static void main(String[] args) {
		Project p1=new Project(13,"chrome","munaf");
		Project p2=new Project(14,"gpt","rakesh");
		Project p3=new Project(15,"deloit","snuhith");
		Employee [] emp=new Employee[3];
		emp[0]=new Employee(19,"shashi",p1,p2);
		emp[1]=new Employee(20,"mayank",p2,p3);
		emp[2]=new Employee(21,"manas",p1,p2,p3);
		
		for(Employee i:emp) {
			
			System.out.println(i);
			
			
		}
		
	}

}
