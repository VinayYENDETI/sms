package com.cg.SpringBootRestAPIProject29.service;

import java.util.List;

import com.cg.SpringBootRestAPIProject29.entity.Student;

public interface StudentService {
	public List<Student> getAllStudent();
	public Student getStudentById(int id);
	public void saveStudent(Student student);
	public Student updateStudent(int id,Student student);
	public void deleteStudent(int id);

}
