package com.cg.SpringBootRestAPIProject29.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.SpringBootRestAPIProject29.entity.Student;
import com.cg.SpringBootRestAPIProject29.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository repo;

	@Override
	public List<Student> getAllStudent() {
		List<Student>list=repo.findAll();
		return list;
	}

	@Override
	public Student getStudentById(int id) {
		Student student=repo.findById(id).get();
		return student;
	}

	@Override
	public void saveStudent(Student student) {
		repo.save(student);
		
	}

	@Override
	public Student updateStudent(int id, Student student) {
		Student student1=repo.findById(id).get();
		student1.setName(student.getName());
		student1.setBranch(student.getBranch());
		student1.setMarks(student.getMarks());
		return repo.save(student1);
		
	}

	@Override
	public void deleteStudent(int id) {
		Student student=repo.findById(id).get();
		repo.delete(student);
	}
}
