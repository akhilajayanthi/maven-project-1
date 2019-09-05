package com.capg.demo.employeeDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

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
