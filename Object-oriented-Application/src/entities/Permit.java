package entities;

public class Permit {
	public void permit(Shape ref) {
		ref.acceptInput();
		ref.compute();
		ref.disp();
		
	}
}
