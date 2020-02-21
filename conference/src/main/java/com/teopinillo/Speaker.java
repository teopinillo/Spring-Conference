package com.teopinillo;

public class Speaker {
	private String firstName;
	private String lastName;

	public Speaker(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return firstName + " " +lastName;		
	}

}
