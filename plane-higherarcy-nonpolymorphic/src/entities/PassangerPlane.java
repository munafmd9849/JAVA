package entities;

public class PassangerPlane extends Plane{
	public void takeOf(){
		System.err.println("palne is taking off in mid range runway");
	}
	public void fly(){
		System.err.println("plane is flying on mid altitude");
	}
	public void land(){
		System.err.println("plane is landing on mid runway");
	}
}
