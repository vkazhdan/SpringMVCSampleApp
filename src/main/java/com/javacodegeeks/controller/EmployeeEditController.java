package com.javacodegeeks.controller;

import com.javacodegeeks.model.Employee;
import com.javacodegeeks.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeEditController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee/{id}")
	public String index(Model model, @PathVariable int id) {
		Employee employee = employeeService.findById(id);
		model.addAttribute("employee", employee);
		return "employeeEdit";
	}

	@PostMapping
	public String updateEmployee(Model model, @ModelAttribute Employee employee) {
		employeeService.updateEmployee(employee);
		return "redirect:/employees";
	}
}
