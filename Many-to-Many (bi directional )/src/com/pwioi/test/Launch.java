package com.pwioi.test;
import com.pwioi.entites.Employee;
import com.pwioi.entites.Project;
public class Launch {

	public static void main(String[] args) {
	
		Project p1=new Project(13,"chrome","munaf");
		Project p2=new Project(14,"gpt","rakesh");
		Project p3=new Project(15,"deloit","snuhith");
		
		
		Employee emp1=new Employee(19,"shashi",p1,p2);
		Employee emp2=new Employee(20,"mayank",p2,p3);
		Employee emp3=new Employee(21,"manas",p1,p2,p3);
		
		p1.setEmp(emp1,emp2);
		p2.setEmp(emp2,emp3);
		p3.setEmp(emp1,emp2,emp3);
		
		System.out.println(p1);
		System.out.println();
		System.out.println(emp3);
	
		
		

	}

}
