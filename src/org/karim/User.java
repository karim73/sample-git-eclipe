package org.karim;

public class User {

	private String firstName;
	private String lastName;

	public User() {
	}

	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	public void greeting() {
		System.out.println("Say Hello!!! " + this.firstName);
	}
	
	public void addComment() {
		this.firstName = "unknown";
	}
}
