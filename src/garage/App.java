package garage;

public class App {

	public static void main(String[] args) {

		Car dreamcar = new Car("Audi", "R8", "black", true);
		dreamcar.print();

		Car brokencar = new Car();
		brokencar.print();

		Boat bestboat = new Boat("Sunseeker", "24PX", "Silver", true);
		bestboat.print();

		Boat brokenboat = new Boat();
		brokenboat.print();

		Plane bestplane = new Plane("Boeing", "787", "White", 200);
		bestplane.print();

		Plane brokenplane = new Plane();
		brokenplane.print();

//		put into an array 

		Vehicle[] vehicles = { dreamcar, bestboat, bestplane };

		for (Vehicle vehicle : vehicles) {

			vehicle.print();
		}

		Car mumsCar = new Car();
		mumsCar.setMake("Nissan");
		mumsCar.setModel("Qashqai");
		mumsCar.setColour("White");
		mumsCar.setBoot(true);

//		mumsCar.printCar();

		Boat dreamboat = new Boat();
		dreamboat.setMake("Sunseeker");
		dreamboat.setModel("24PX");
		dreamboat.setColour("White");
		dreamboat.setOnWater(true);

//		dreamboat.printBoat();

		Plane easyjet = new Plane();
		easyjet.setMake("Boeing");
		easyjet.setModel("747");
		easyjet.setColour("Orange");
		easyjet.setWingsSize(196);

//		easyjet.printPlane();

		dreamboat.toString();
	}
}
