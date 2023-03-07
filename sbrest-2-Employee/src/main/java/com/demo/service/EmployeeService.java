package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;
@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository er;
	
	//Insert Employee
	public Employee insertEmployee(Employee e) {
		return er.save(e);
	}
	
	//Get All Employee
	public List<Employee> getAllEmployee(){
		return er.findAll();
	}
	
	//Update Employee
	public Employee updateEmployee(Employee e) {
		Employee existingEmployee = er.findById(e.getId()).orElse(null);
		existingEmployee.setName(e.getName());
		existingEmployee.setCity(e.getCity());
		existingEmployee.setSalary(e.getSalary());
		return er.save(existingEmployee);
	}
	
	//Delete Employee By id
	public String deleteEmployeebyid(int id) {
		er.deleteById(id);
		return "Employee Deleted Succesfully !!"+id;
	}
}

