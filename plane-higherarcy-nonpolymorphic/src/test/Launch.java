package test;

import entities.*;

public class Launch {
	public static void main(String []args) {
		FighterPlane fp=new FighterPlane();
		PassangerPlane pp=new PassangerPlane();
		CargoPlane cp=new CargoPlane();
		Airport a=new Airport();
		a.permit(cp);
		System.err.println();
		a.permit(pp);
		System.err.println();
		a.permit(fp);
	}
}
