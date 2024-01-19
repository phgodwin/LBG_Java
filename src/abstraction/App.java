package abstraction;

import java.util.List;

import garage.Boat;
import garage.Car;
import garage.Plane;
import garage.Vehicle;

public class App {

	public static void main(String[] args) {

		List<Vehicle> workList = List.of(new Car("Ford", "KA", "Yellow", true),
				new Boat("Yacht", "Super", "White", true), new Plane("Easyjet", "747", "Red", 200),
				new Car("Audi", "R8", "blue", true));

		for (Vehicle v : workList) {

			System.out.println(v.calcBill());

		}

	}

}
