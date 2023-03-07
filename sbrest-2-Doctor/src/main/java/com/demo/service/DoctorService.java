package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Doctor;
import com.demo.repository.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository dr;
	
	public Doctor insertDoctor(Doctor d) {
		return dr.save(d);
	}
	
	public List<Doctor> getAllDoctor(){
		return dr.findAll();
	}
	
	public Doctor updateDoctor(Doctor d) {
		Doctor existinDoctor = dr.findById(d.getId()).orElse(d);
		existinDoctor.setName(d.getName());
		existinDoctor.setCity(d.getCity());
		existinDoctor.setNumber(d.getNumber());
		return dr.save(existinDoctor);
	}
	
	public String deleteDoctorById(int id) {
		return "Doctor Deleted Sucessfully "+id;
	}
}
