package com.javacodegeeks.service;

import java.util.List;

import com.javacodegeeks.model.Employee;

public interface EmployeeService {
	
	Employee findById(int id);
    
    void saveEmployee(Employee employee);
     
    void updateEmployee(Employee employee);
     
    List<Employee> findAllEmployees();
     
	void deleteEmployee(int id);
}

