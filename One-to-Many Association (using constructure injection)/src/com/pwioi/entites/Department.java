package com.pwioi.entites;

import java.util.Arrays;

public class Department {
	private String depId;
	private String deptName;
	private String deptMgr;
	private  String deptLoc;
	private Employee []empArr;
	public String getDepId() {
		return depId;
	}
	public String getDeptName() {
		return deptName;
	}
	public String getDeptMgr() {
		return deptMgr;
	}
	public String getDeptLoc() {
		return deptLoc;
	}
	public Employee[] getEmpArr() {
		return empArr;
	}
	public Department(String depId, String deptName, String deptMgr, String deptLoc, Employee[] empArr) {
		super();
		this.depId = depId;
		this.deptName = deptName;
		this.deptMgr = deptMgr;
		this.deptLoc = deptLoc;
		this.empArr = empArr;
	}
	public String toString() {
		
		return "<=Department=>\n"+deptName+" \n"+"ID=>"+depId+" \n"+"Manager=>"+deptMgr+" "+"Location=>"+deptLoc+" \n"+"Employes are\n"+Arrays.toString(empArr);
				
	
	}
	
}
