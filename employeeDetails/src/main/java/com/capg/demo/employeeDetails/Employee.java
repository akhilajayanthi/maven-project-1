package com.capg.demo.employeeDetails;

public class Employee {
   
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	private String name;
	private int phone;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
