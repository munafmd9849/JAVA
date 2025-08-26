package com.pwioi.entites;

import java.util.Arrays;

public class Project {
	public Project(int pId, String pName, String pMgr) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pMgr = pMgr;
	}
	private int pId;
	private String pName;
	private String pMgr;
	private Employee[]emp;

	public void setpId(int pId) {
		this.pId = pId;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setpMgr(String pMgr) {
		this.pMgr = pMgr;
	}
	public void setEmp(Employee...emp) {
		this.emp = emp;
	}
	public int getpId() {
		return pId;
	}
	public String getpName() {
		return pName;
	}
	public String getpMgr() {
		return pMgr;
	}
	public Employee[] getEmp() {
		return emp;
	}
	@Override
	public String toString() {
		String s ="";
		for(Employee i:emp) {
			s+=" "+i.getEmpName();
		}
		return s;
	}
	 
	

	
	

}
