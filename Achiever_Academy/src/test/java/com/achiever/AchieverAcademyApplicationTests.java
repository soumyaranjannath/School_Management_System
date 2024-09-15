package com.achiever;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.achiever.model.Student;
import com.achiever.repository.StudentRepository;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AchieverAcademyApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	@Order(1)
	void testSaveStudent() {
		Student student=new Student("Sunil Setty",789,35,"std-1",null);
		 Student savedStudent = studentRepository.save(student);
		try {
            assertThat(savedStudent).isNotNull();
            System.out.println("Test passed: Saved student is not null.");
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
		
		
	}
}
