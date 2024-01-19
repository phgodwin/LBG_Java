package data;

public class Pet {

	private String name;

	private int age;

	private String colour;

	private String breed;

	public Pet(String name, int age, String colour, String breed) {
		super();
		this.name = name;
		this.age = age;
		this.colour = colour;
		this.breed = breed;
	}

	public Pet() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", colour=" + colour + ", breed=" + breed + "]";
	}

}
