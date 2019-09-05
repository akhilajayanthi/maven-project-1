package com.capg.demo.employeeDetails;

public class Address {

	private String state;

	private String city;

	private int zipCode;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public Address(String state, String city, int zipCode) {

		this.state = state;
		this.city = city;
		this.zipCode = zipCode;

	}

	public Address() {

	}

	@Override
	public String toString() {
		return ", state=" + state + ", city=" + city + ", zipCode=" + zipCode;
	}

}
