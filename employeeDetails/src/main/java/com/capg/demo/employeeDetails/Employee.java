package com.capg.demo.employeeDetails;



public class Employee {

	private String name;

	private int phone;

	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {

		this.address = address;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee: name=" + name + ", phone=" + phone + address;
	}

}
