package com.capg.demo.employeeDetails;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.capg.demo.employeeDetails")
@ImportResource("/app-config.xml")
public class AppConfig {

	@Value("sfvdsg")
	private String name;

	@Value("896454")
	private int phone;

	@Value("telangana")
	private String state;

	@Value("hyderabad")
	private String city;

	@Value("500050")
	private int zipCode;

	@Bean
	public Employee Employee() {

		Employee emp = new Employee();
		emp.setName(name);
		emp.setPhone(phone);
		Address add = new Address();
		add.setCity(city);
		add.setState(state);
		add.setZipCode(zipCode);
		emp.setAddress(add);
		return emp;
	}

}
