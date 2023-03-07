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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController
@RequestMapping(value = "student")
public class StudentController {

	@Autowired
	private StudentService ss;

	// For Adding Student
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student s) {
		return ss.insertStudent(s);
	}

	// For Getting Student By Different Ways
	@GetMapping(value = "findbyid/{id}")
	public Student findStudentBySid(@PathVariable("id") int sid) {
		return ss.findBySid(sid);
	}

	@GetMapping("findbysname/{sname}")
	public Student findStudentBySname(@PathVariable("sname") String sname) {
		return ss.findStudentBySname(sname);
	}

	@GetMapping("findall")
	public List<Student> findAllStudents() {
		return ss.findAllStudent();
	}

	// Delete Student By Sid
	@DeleteMapping("/deletebyid/{id}")
	public void deleteStudent(@PathVariable("id") int sid) {
		ss.deleteStudentById(sid);
	}
	//update Student
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student s) {
		return ss.updateStudent(s);
	}

}
