package objects;

public class Person {
	
	String name;
	
	String job;
	
	int age;
	
	String pet;
	
	void intro() {
		
		System.out.println("Hi, my name is " + name + ". I work as a " + 
		job + ". I am " + age + " years old. I have a " + pet +".");
	}

}
