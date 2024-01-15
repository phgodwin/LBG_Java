package operators;

public class App {

	public static void main(String[] args) {

		System.out.println(add(15, 10));
		System.out.println(subtract(50, 25));
		System.out.println(multiply(10, 6));
		System.out.println(divide(30, 3));
		System.out.println(divide(10.0, 3.0));

		System.out.println(greaterThan(15, 5));
		System.out.println(greaterThan(45, 72));

	}

//	calculator exercise 
//	create methods to add, subtract, multiple & divide - THEN test them

	public static int add(int a, int b) {

		return a + b;
	}

	public static int subtract(int a, int b) {

		return a - b;
	}

	public static int multiply(int a, int b) {

		return a * b;
	}

	public static double divide(double a, double b) {

		return a / b;
	}

	public static boolean greaterThan(int a, int b) {

		return a > b;
	}

}
