package garage;

public class Runner {

	public static void main(String[] args) {

		Garage myGarage = new Garage();

		myGarage.park(new Car("Ford", "Kuga", "Black", true));

		myGarage.park(new Plane("airbus", "3000", "White", 345));

		myGarage.park(new Boat("wooden", "yacht", "Silver", true));

		myGarage.print();

		myGarage.toString();

		myGarage.fix();

	}

}
