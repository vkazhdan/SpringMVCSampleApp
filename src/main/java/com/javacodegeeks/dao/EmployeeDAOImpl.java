package com.javacodegeeks.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.javacodegeeks.model.Employee;

@Repository("employeeDao")
public class EmployeeDAOImpl extends AbstractDAO<Integer, Employee> implements EmployeeDAO {

	@Override
	public Employee findById(int id) {
		return getByKey(id);
	}

	@Override
	public void saveEmployee(Employee employee) {
		persist(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		Criteria criteria = createEntityCriteria();
        return (List<Employee>) criteria.list();
	}

}
