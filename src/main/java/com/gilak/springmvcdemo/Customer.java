package com.gilak.springmvcdemo;


import javax.validation.Valid;
import javax.validation.constraints.*;
@Valid
public class Customer {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;

	@Min(value = 0,message = "must be greater than or equal by zero")
	@Max(value = 10,message = "must be less than or equal by 10")
	private Integer freePasses;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
}








