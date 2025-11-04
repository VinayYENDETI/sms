package com.cg.SpringBootRestAPIProject29.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.SpringBootRestAPIProject29.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
