package com.pwioi.entites;

public class Employee {
	private int empId;
	private String empName;
	private Branch branch;
	public Employee(int empId, String empName,Branch branch) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.branch=branch;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String toString() {
		return empName+" "+empId+" "+branch;
	}
}
