package com.achiever.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.achiever.dao.StudentDao;
import com.achiever.entity.Student;
@Component
public class StudentService {
	
	@Autowired
	private StudentDao sd;
	
	public void saveStudent(String name,Integer rollno,Integer age,String sClass,String sPhoto) throws IOException {
		File file= new File(sPhoto);
		byte[] photo=Files.readAllBytes(file.toPath());
		Student student =new Student(name,rollno,age,sClass,photo);
		sd.saveStudent(student);
	}
}
