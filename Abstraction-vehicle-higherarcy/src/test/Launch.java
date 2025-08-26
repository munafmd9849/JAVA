package test;

import enteties.Ferrari;
import enteties.Innova;
import enteties.Maruthi800;
import enteties.Road;

public class Launch {
	public static void main(String []args){
		Maruthi800 m=new Maruthi800();
		Innova d=new Innova();
		Ferrari f=new Ferrari();
		Road r=new Road();
		
		r.permit(d);
		System.out.println();
		r.permit(m);
		System.out.println();
		r.permit(f);
	}
}
