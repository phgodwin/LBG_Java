package garage;

public class Car extends Vehicle {

	private boolean boot;

	public boolean isBoot() {
		return boot;
	}

	public void setBoot(boolean boot) {
		this.boot = boot;
	}

	public void printCar() {

		System.out.println("Make: " + getMake());
		System.out.println("Model: " + getModel());
		System.out.println("Colour: " + getColour());
		System.out.println("Has boot: " + isBoot());

	};

}
