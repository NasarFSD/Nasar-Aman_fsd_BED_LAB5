package org.greatlearning.com.ems.controllers;

import java.util.List;

import org.greatlearning.com.ems.entity.Employee;
import org.greatlearning.com.ems.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@GetMapping("/employees")
	public String listEmployee(Model model) {
		List<Employee> employees=employeeService.getAllEmployee();
		model.addAttribute("employees",employees);
		return "employees";
		
	}
	@GetMapping("/employees/{id}")
	public String deleteEmployeeId(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employees";
		
	}
	@GetMapping("/employees/new")
	public String createEmployeeForm(Model model) {
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "create_employee";
		
	}
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.insertEmployee(employee);
		return "redirect:/employees";
		
	}
	@GetMapping("/employees/edit/{id}")
	public String editEmployeeForm(@PathVariable("id") int id,Model model) {
		Employee employee=employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "edit_employee";
	}
	@PostMapping("/employees/{id}")
	public String updateEmployee(@PathVariable("id")int id,@ModelAttribute("employee")Employee employee) {
		Employee existingEmployee=employeeService.getEmployeeById(id);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		employeeService.insertEmployee(existingEmployee);
		return "redirect:/employees";
	}

}
