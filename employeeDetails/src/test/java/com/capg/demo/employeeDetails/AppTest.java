package com.capg.demo.employeeDetails;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest

{
	Employee emp = new Employee();
	Address add = new Address("telangana", "hyderabad", 500050);

	@Before
	public void beforeTest() {

		//emp = App.setDetails("hsj", 98875, add);

	}

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {
		assertNotNull(emp);
		System.out.println(emp.getPhone());
		assertEquals(98875, emp.getPhone());
	}
}
