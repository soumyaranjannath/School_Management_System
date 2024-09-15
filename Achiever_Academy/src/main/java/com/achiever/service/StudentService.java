package com.achiever.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.achiever.model.Student;
import com.achiever.repository.StudentRepository;
@Component
@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	 public Optional<Student> getStudentById(Integer id) {
	        return studentRepository.findById(id);
	    }

}
