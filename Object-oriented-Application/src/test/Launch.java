package test;

import entities.*;

public class Launch {

	public static void main(String[] args) {
		Square s=new Square();
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		
		Permit p=new Permit();
		p.permit(s);
		p.permit(r);
		p.permit(c);

	}
}
