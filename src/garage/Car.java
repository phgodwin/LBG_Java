package garage;

public class Car extends Vehicle {

	@Override
	public int calcBill() {

		return 50;
	}

	@Override
	public String toString() {
		return "Car [boot=" + boot + ", getMake()=" + getMake() + ", getModel()=" + getModel() + ", getColour()="
				+ getColour() + ", getId()=" + getId() + "]";
	}

	public Car(String make, String model, String colour, boolean boot) {
		super(make, model, colour);
		this.boot = boot;
	}

	public Car() {
		super();
	}

	private boolean boot;

	public boolean isBoot() {
		return boot;
	}

	public void setBoot(boolean boot) {
		this.boot = boot;
	}

	@Override
	public void print() {

		super.print();
		System.out.println("Has boot: " + isBoot());

	};

}
