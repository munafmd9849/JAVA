package entities;

public class FighterPlane extends Plane {
	public void takeOf(){
		System.err.println("palne is taking off in short range runway");
	}
	public void fly(){
		System.err.println("plane is flying on high altitude");
	}
	public void land(){
		System.err.println("plane is landing on short runway");
	}
}
