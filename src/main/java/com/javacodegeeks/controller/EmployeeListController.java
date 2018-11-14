package com.javacodegeeks.controller;

import com.javacodegeeks.model.Employee;
import com.javacodegeeks.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeListController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping
	public String index(Model model) {
		List<Employee> employees = employeeService.findAllEmployees();
		model.addAttribute("employees", employees);
		model.addAttribute("newEmployee", new Employee());
		return "employeeList";
	}

	@PostMapping
	public String saveEmployee(Model model, @ModelAttribute Employee newEmployee) {
		employeeService.saveEmployee(newEmployee);
		return "redirect:/employees";
	}
}
