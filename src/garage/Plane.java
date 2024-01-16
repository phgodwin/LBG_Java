package garage;

public class Plane extends Vehicle {

	private String WingSize;

	public String getWingSize() {
		return WingSize;
	}

	public void setWingsSize(String wingsSize) {
		WingSize = wingsSize;
	}

	public void printPlane() {

		System.out.println("Make: " + getMake());
		System.out.println("Model: " + getModel());
		System.out.println("Colour: " + getColour());
		System.out.println("Wing size: " + getWingSize());

	}
}
