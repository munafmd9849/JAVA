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
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Project[] getProject() {
		return project;
	}
	public void setProject(Project[] project) {
		this.project = project;
	}
	@Override
	public String toString() {
		String s ="";
		for(Project i:project) {
			s+=" "+i.getpName();
		}
		return s;
	}
	
	
}
