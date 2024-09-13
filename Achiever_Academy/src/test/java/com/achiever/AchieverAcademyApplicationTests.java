package com.achiever;

import java.io.IOException;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.achiever.entity.Student;
import com.achiever.service.StudentService;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AchieverAcademyApplicationTests {
	
	@Autowired
	private StudentService ss;
	
	@Test
	@Order(1)
	void testUpdateStudent() throws IOException {
		ss.updateStudent("Sohail Khan",123,8,"lkg","D:\\java ni\\photo.jpg");
		System.out.println("Student updated successfully...");
	}
	@Test
	@Order(2)
	void testGetStudent() throws IOException {
		Student student=ss.getStudent(123);

		System.out.println(student);
	}

}
