package com.javacodegeeks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;

	public void run() {
		System.out.println("Started");
		System.out.println("EmployeeService: " + employeeService);
		System.out.println("Employees: " + employeeService.findAllEmployees());
		System.out.println("Employee [1]: " + employeeService.findById(1));
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.javacodegeeks");
		EmployeeServiceTest test = applicationContext.getBean(EmployeeServiceTest.class);
		test.run();
	}
}
