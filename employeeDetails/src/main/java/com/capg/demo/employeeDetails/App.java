package com.capg.demo.employeeDetails;

/**
 * Hello world!
 *
 */
public class App 
{
	String name,address;
	String phone;
	
	public static Employee setDetails(String name,int phone,String address) {
		
		Employee emp = new Employee();
		emp.setName(name);
		emp.setPhone(phone);
		emp.setAddress(address);
		
		return emp;
		
	}
	
    public static void main( String[] args )
    {
      
    	Employee emp = setDetails("abc",98659406,"hyd");
    	System.out.println(emp.getName()+ " "+ emp.getPhone()+ " "+emp.getAddress());
    }
}
