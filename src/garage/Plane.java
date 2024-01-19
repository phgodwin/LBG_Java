package garage;

public class Plane extends Vehicle {

	@Override
	public int calcBill() {
		return (getWingSize() * 2);
	}

	@Override
	public String toString() {
		return "Plane [WingSize=" + WingSize + ", getWingSize()=" + getWingSize() + ", getMake()=" + getMake()
				+ ", getModel()=" + getModel() + ", getColour()=" + getColour() + "]";
	}

	public Plane() {
		super();
	}

	public Plane(String make, String model, String colour, int wingSize) {
		super(make, model, colour);
		this.WingSize = wingSize;

	}

	private int WingSize;

	public int getWingSize() {
		return WingSize;
	}

	public void setWingsSize(int wingsSize) {
		WingSize = wingsSize;
	}

	@Override
	public void print() {

		super.print();
		System.out.println("Wing size: " + getWingSize());

	}
}
