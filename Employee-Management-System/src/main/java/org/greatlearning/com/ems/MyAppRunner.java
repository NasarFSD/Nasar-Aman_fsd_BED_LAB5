package org.greatlearning.com.ems;

import org.greatlearning.com.ems.entity.Employee;
import org.greatlearning.com.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements CommandLineRunner {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Employee e1=new Employee(); e1.setFirstName("Suresh");
		 * e1.setLastName("Rana"); e1.setEmail("suresh@gmail.com");
		 * 
		 * Employee e2=new Employee(); e2.setFirstName("Ramesh");
		 * e2.setLastName("Rajput"); e2.setEmail("ramesh@gmail.com");
		 * employeeRepository.save(e1); employeeRepository.save(e2);
		 */
		
	}

}
