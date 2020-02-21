package com.teopinillo;

import lombok.Data;

@Data
public class Speaker {
	private String firstName;
	private String lastName;

	public Speaker(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
