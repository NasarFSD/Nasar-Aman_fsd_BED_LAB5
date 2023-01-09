package org.greatlearning.com.ems.services;

import java.util.List;

import org.greatlearning.com.ems.entity.Employee;
import org.greatlearning.com.ems.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	 private EmployeeRepository employeeRepository;
	 

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee insertEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee e) {
		
		return employeeRepository.save(e);
	}

}
