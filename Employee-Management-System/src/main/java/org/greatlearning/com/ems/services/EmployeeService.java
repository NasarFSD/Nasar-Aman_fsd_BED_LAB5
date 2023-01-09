package org.greatlearning.com.ems.services;

import java.util.List;

import org.greatlearning.com.ems.entity.Employee;

public interface EmployeeService {
	
	Employee insertEmployee(Employee employee);
	void deleteEmployee(int id);
	List<Employee>getAllEmployee();
	Employee getEmployeeById(int id);
	Employee updateEmployee(Employee e);

}
