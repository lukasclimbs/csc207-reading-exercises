public class Dog {

	public String name;
	public String breed;
	public int age;

	public Dog (String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public int ageInDogYears() {
		return (this.age * 7);
	}

	public void bark() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.breed);

	}

public static void main(String[] args) {
		Dog fido = new Dog("Fido", "Golden Retriever", 3);
		fido.bark();
	}

}