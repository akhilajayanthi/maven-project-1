package com.capg.demo.employeeDetails;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest

{
	Employee emp = new Employee();
	Address add = new Address("telangana", "hyderabad", 500050);

	

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {
		
		assertNotNull(emp);
		System.out.println(emp.getPhone());
		assertEquals(0, emp.getPhone());
	}
}
