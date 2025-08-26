package com.pwioi.entites;

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
	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", pMgr=" + pMgr + "]";
	}
	

}
