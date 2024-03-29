package garage;

public abstract class Vehicle implements Comparable<Vehicle> {

	public abstract int calcBill();

	private final int id;

	private String make;

	private String model;

	private String colour;

	private static int count;

	public Vehicle(String make, String model, String colour) {
		super();
		this.id = ++count;
		this.make = make;
		this.model = model;
		this.colour = colour;
	}

	public void print() {
		System.out.println("Make: " + this.make);
		System.out.println("Model: " + this.model);
		System.out.println("Colour: " + this.colour);
	}

	public Vehicle() {
		super();
		this.id = count++;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", make=" + make + ", model=" + model + ", colour=" + colour + "]";
	}

	@Override
	public int compareTo(Vehicle o) {
		return this.make.compareTo(o.make);
	}

//	compare by id
//	@Override
//	public int compareTo(Vehicle o) {
//
//		return o.id - id;
//	}

}
