package com.javacodegeeks.dao;

import java.util.List;

import com.javacodegeeks.model.Employee;

public interface EmployeeDAO {

	Employee findById(int id);
	 
    void saveEmployee(Employee employee);
     
    List<Employee> findAllEmployees();
 
    void delete(Employee employee);
}

