package com.example.helloworld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	
	@Autowired
	public EmployeeService empService;

	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee emp) {
		empService.addToEmpList(emp);
		
		return emp;
	}
	
	@PutMapping("/employees")
	public Employee updateEmpDetails(@RequestBody Employee emp) {
		empService.updateEmpList(emp);
		return emp;
	}
	
	@DeleteMapping("/employees/{id}")
	public String  deleteEmployee(@PathVariable String id) {
		empService.deleteFromEmpList(id);;
		
		return "Success";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmpDetails() {
		
		return empService.getEmpList();
		
	}
	
	
	
	
}
