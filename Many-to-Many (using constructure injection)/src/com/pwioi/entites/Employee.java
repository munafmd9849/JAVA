package com.pwioi.entites;

import java.util.Arrays;

public class Employee {
	private int empid;
	private String empName;
	private Project [] project;
	public Employee(int empid, String empName, Project... project) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName +"]\n"+ "project=" + Arrays.toString(project) + "]";
	}
}
