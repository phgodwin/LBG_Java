package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import garage.Boat;
import garage.Car;
import garage.Plane;
import garage.Vehicle;

public class App {

	public static void main(String[] args) {

		List<Vehicle> transport = new ArrayList<>();

		Vehicle c1 = new Car("Ferarri", "Spider", "Red", true);
		Vehicle c2 = new Car("Lambo", "Urus", "Green", true);
		Vehicle p1 = new Plane("Spitfire", "218", "White", 173);
		Vehicle p2 = new Plane("Boeing", "747", "White", 721);
		Vehicle b1 = new Boat("Sunseeker", "124x", "Silver", true);
		Vehicle b2 = new Boat("Pirate", "Fighter", "Brown", true);

		transport.add(c2);
		transport.add(b1);
		transport.add(p2);
		transport.add(p1);
		transport.add(b2);
		transport.add(c1);

		System.out.println(transport);

		Collections.sort(transport);

		System.out.println(transport);

	}

}
