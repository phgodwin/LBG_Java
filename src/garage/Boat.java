package garage;

public class Boat extends Vehicle {

	private boolean onWater;

	public boolean isOnWater() {
		return onWater;
	}

	public void setOnWater(boolean onWater) {
		this.onWater = onWater;
	}

	public void printBoat() {

		System.out.println("Make: " + getMake());
		System.out.println("Model: " + getModel());
		System.out.println("Colour: " + getColour());
		System.out.println("On water: " + isOnWater());

	}

}
