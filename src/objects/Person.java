package objects;

public class Person {

	private String name;

	private String job;

	private int age;

	private String pet;

	public Person(String name, String job, int age, String pet) {

		setName(name);
		setJob(job);
		setAge(age);
		setPet(pet);
	}

	public Person() {
	}

	public Person(String name, int age) {

		setName(name);
		setAge(age);
	}

	void intro() {

		System.out.println("Hi, my name is " + name + ". I work as a " + job + ". I am " + age + " years old. I have a "
				+ pet + ".");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		} else {
			System.out.println("Please provide a valid age between 0 and 120");

		}

	}

	public int getAge() {
		return age;
	}

	public void setPet(String pet) {
		this.pet = pet;
	}

	public String getPet() {
		return pet;
	}

}
