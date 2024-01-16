package garage;

public class App {

	public static void main(String[] args) {

		Vehicle myCar = new Vehicle();
		myCar.setMake("Ford");
		myCar.setModel("Fiesta");
		myCar.setColour("Red");

		Car mumsCar = new Car();
		mumsCar.setMake("Nissan");
		mumsCar.setModel("Qashqai");
		mumsCar.setColour("White");
		mumsCar.setBoot(true);

		mumsCar.printCar();

		Boat dreamboat = new Boat();
		dreamboat.setMake("Sunseeker");
		dreamboat.setModel("24PX");
		dreamboat.setColour("White");
		dreamboat.setOnWater(true);

		dreamboat.printBoat();

		Plane easyjet = new Plane();
		easyjet.setMake("Boeing");
		easyjet.setModel("747");
		easyjet.setColour("Orange");
		easyjet.setWingsSize("196ft");

		easyjet.printPlane();
	}
}
