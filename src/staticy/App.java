package staticy;

import garage.Car;

public class App {

	public static void main(String[] args) {

		Car herbie = new Car("volkswagen", "beetle", "white", true);
		Car brum = new Car("old", "small", "yellow", false);
		Car mcqueen = new Car("Chevrolet", "corvette", "Red", false);

		System.out.println(herbie);
		System.out.println(brum);
		System.out.println(mcqueen);
	}
}
