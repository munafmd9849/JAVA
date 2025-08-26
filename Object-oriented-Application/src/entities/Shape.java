package entities;

abstract public class Shape {
	public float area;
	public void disp() {
		System.out.println("the are of shape is "+area);
	}
	public abstract void  acceptInput();
	public abstract void compute();
}
