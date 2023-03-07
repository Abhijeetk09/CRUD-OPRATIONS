package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	//Add Employee
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee e) {
		return es.insertEmployee(e);
	}
	
	//Get All Employe
	@GetMapping("/getall")
	public List<Employee> getAllEmployee(){
		return es.getAllEmployee();
	}
	
	//Update Employee
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee e) {
		return es.updateEmployee(e);
	}
	
	//Delete Employee By id
	@DeleteMapping("/delete/{id}")
	public String deleteEmployeeById(@PathVariable("id") int id) {
		return es.deleteEmployeebyid(id);
	}
}
