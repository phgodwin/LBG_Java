package garage;

import java.util.ArrayList;

public class Garage {

	@Override
	public String toString() {
		return "Garage [vehicles=" + vehicles + "]";
	}

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void park(Vehicle vehicle) {

		vehicles.add(vehicle);
	}

	public void collect(Vehicle vehicle) {

		vehicles.remove(vehicle);
	}

	public void print() {

	}

	public void fix() {

		int sum = 0;
		for (Vehicle vehicle : vehicles) {
			sum = sum + vehicle.calcBill();
			System.out.println("Bill: " + vehicle.calcBill());

		}
		System.out.println("Total Bill: " + sum);
	}
}
