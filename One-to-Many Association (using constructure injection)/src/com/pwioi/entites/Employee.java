package com.pwioi.entites;

public class Employee {
	private int empId;
	private String empName;
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String toString() {
		return "({"+empName+"=>"+empId+"})";
	}
}
