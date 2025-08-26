package test;

import entities.*;

public class Launch {
	public static void main(String []args){
		Tiger t=new Tiger();
		Deer d=new Deer();
		Monkey m=new Monkey();
		Forest a=new Forest();
		a.permit(d);
		System.out.println();
		a.permit(m);
		System.out.println();
		a.permit(t);
	}
}
