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

import com.demo.model.Doctor;
import com.demo.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService ds;
	
	@PostMapping("/add")
	public Doctor addDoctor(@RequestBody Doctor d) {
		return ds.insertDoctor(d);
	}
	
	@GetMapping("/getall")
	public List<Doctor> getAllDoctor(){
		return ds.getAllDoctor();
	}
	
	@PutMapping("/update")
	public Doctor updateDoctor(@RequestBody Doctor d) {
		return ds.updateDoctor(d);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDoctorById(@PathVariable("id") int id) {
		return ds.deleteDoctorById(id);
	}
}
