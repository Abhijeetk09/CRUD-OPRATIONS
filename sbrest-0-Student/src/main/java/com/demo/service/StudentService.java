package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Student;
import com.demo.repository.StudentRepository;

@Service
@Transactional
public class StudentService {

	@Autowired
	StudentRepository sr;

	public Student insertStudent(Student s) {
		return sr.save(s);
	}

	public Student findBySid(int sid) {
		return sr.findStudentBySid(sid);
	}

	public Student findStudentBySname(String sname) {
		return sr.findStudentBySname(sname);
	}

	public List<Student> findAllStudent() {
		return sr.findAll();
	}

	public void deleteStudentById(int sid) {
		sr.deleteById(sid);
	}

	public Student updateStudent(Student s) {
		return sr.save(s);
	}

}
