package garage;

public class Boat extends Vehicle {

	@Override
	public int calcBill() {

		return 150;
	}

	@Override
	public String toString() {
		return "Boat [onWater=" + onWater + ", getMake()=" + getMake() + ", getModel()=" + getModel() + ", getColour()="
				+ getColour() + ", getId()=" + getId() + "]";
	}

	public Boat() {
		super();
	}

	public Boat(String make, String model, String colour, boolean onWater) {
		super(make, model, colour);
		this.onWater = onWater;
	}

	private boolean onWater;

	public boolean isOnWater() {
		return onWater;
	}

	public void setOnWater(boolean onWater) {
		this.onWater = onWater;
	}

	@Override
	public void print() {

		super.print();
		System.out.println("On water: " + isOnWater());

	}

}
