package com.thomasjayconsulting.multidb.dto;

import lombok.Data;

@Data
public class NewUserRequest {

    private String emailAddress;
    private String firstName;
    private String lastName;
	public NewUserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewUserRequest(String emailAddress, String firstName, String lastName) {
		super();
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "NewUserRequest [emailAddress=" + emailAddress + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
    
    

}
