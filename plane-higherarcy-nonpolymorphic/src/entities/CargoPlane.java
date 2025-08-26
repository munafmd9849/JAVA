package entities;

public class CargoPlane  extends Plane{
	public void takeOf(){
		System.err.println("palne is taking off on long runway");
	}
	public void fly(){
		System.err.println("plane is flying at lower height");
	}
	public void land(){
		System.err.println("plane is landing on a longer runway");
	}
}
