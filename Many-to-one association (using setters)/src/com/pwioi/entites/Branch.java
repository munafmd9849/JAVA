package com.pwioi.entites;

public class Branch {
	private int branchId;
	private String bloc;
	public Branch(int branchId, String bloc) {
		super();
		this.branchId = branchId;
		this.bloc = bloc;
	}
	public int getBranchId() {
		return branchId;
	}
	public String getBloc() {
		return bloc;
	}
	public String toString() {
		return bloc;
	}
	
}
