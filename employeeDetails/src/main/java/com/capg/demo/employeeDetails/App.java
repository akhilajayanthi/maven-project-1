package com.capg.demo.employeeDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("/application.properties")
public class App {

	@Value("${name}")
	private String name;

	@Value("${phone}")
	private int phone;

	@Value("${state}")
	private String state;

	@Value("${city}")
	private String city;

	@Value("${zipCode}")
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

	@Autowired
	static Employee emp;

	public static void disableWarning() {
		System.err.close();
		System.setErr(System.out);
	}

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		disableWarning();
		context.scan("com.capg.demo.employeeDetails");
		context.refresh();

		emp = context.getBean(Employee.class);
		System.out.println(emp);
		context.close();

	}
}
