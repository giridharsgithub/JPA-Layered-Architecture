package com.controller;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class Client {
	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeServiceImpl();
		
		Employee emp = new Employee(101, "ram", 900000, "jai");
//		inserting data in the database 
//		service.addEmployee(emp);
		
//		Updating data of the database 
		emp.setEmpsal(800000);
		emp.setEmpadd("Hyderabad");
//		service.updateEmployee(emp);
		
//		fetching data from the database
		Employee emp1 = service.findByEmployeeId(101);
		
//		System.out.println(emp1);
		
//		deleting data 
		service.deleteEmployee(emp1);
	}
}

