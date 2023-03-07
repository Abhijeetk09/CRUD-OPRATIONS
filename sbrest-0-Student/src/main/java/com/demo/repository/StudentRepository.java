package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findStudentBySid(int sid);

	Student findStudentBySname(String sname);

}
