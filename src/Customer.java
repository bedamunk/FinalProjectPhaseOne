

import java.util.Random;

public class Customer {
	
	// instance variables
	
	String firstName;
	String lastName;
	String streetAddress;
	String city;
	String state;
	int zipCode;
	int phone;
	int customerID;
	
	// default constructor 
	
	Customer() {
		setCustomerID();
		
	}

	// setters and getters
	
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

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID() {
		Random rand = new Random();
		int customerID = rand.nextInt(1000);
		this.customerID = customerID;
	}
	
	

}
