package com.javacodegeeks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacodegeeks.dao.EmployeeDAO;
import com.javacodegeeks.model.Employee;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
    private EmployeeDAO dao;

	@Override
	public Employee findById(int id) {		
		return dao.findById(id);
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 dao.saveEmployee(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee entity = dao.findById(employee.getId());
        if(entity!=null){
            entity.setName(employee.getName());
        }
	}

	@Override
	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public void deleteEmployee(int id) {
		Employee employee = dao.findById(id);
		if (employee != null) {
			dao.delete(employee);
		}
	}
}
