package enteties;

public abstract class Car {
	public void start() {
		System.out.println("the car is started");
		
	}
	public void stop() {
		System.out.println("the car is stoped");
	}
	public abstract void  accelerate();
	public abstract void  combution();
	public abstract void  drive();
}
