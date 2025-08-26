package com.pwioi.entites;

public class Employee {
	private int empId;
	private String empName;
	private String empAddr;
	private Account adder;
//	public Employee(int empId, String empName, String empAddr ,Account adder) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.empAddr = empAddr;
//		this.adder=adder;
//	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public String toString() {
		return  "Employee Details\n"+
				"Name: "+empName+"\n"+
				"emp_Id: "+empId+"\n"+
				"Address: "+empAddr+"\n"+
				"Account Details : "+adder;
				
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	public void setAdder(Account adder) {
		this.adder = adder;
	}
}
