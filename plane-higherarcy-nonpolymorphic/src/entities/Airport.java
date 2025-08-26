package entities;

public class Airport {
	public void permit(Plane ref) {
		ref.takeOf();
		ref.fly();
		ref.land();
	}
}
