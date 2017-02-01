/**
* A class containing the info of a student
*/
public class Student {

	private String firstName;
	private String lastName;
	private int id;
	private int age;

	public Student (String firstName, String lastName, int id, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
	}

/**
* Sets the age of a student. Age must be non-negative.
*
* @param age the new, non-negative age of the student.
* @throws IllegalArgumentException if a non-negative value is given.
*/
public void setAge(int age) { 
	if (age >= 0) {
		this.age = age;
	} else {
		throw new IllegalArgumentException();
	}
}


/**
* Returns the age of a student.
*
* @param None.
* @throws Nothing.
*/
public void getAge() {
	return this.age;
}
}

