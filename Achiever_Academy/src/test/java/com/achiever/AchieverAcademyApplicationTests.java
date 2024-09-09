package com.achiever;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.achiever.entity.Student;

@SpringBootTest
class AchieverAcademyApplicationTests {
	
	@Autowired
	private Student student;
	@Test
	void testStudent() {
		System.out.println(student);
	}

}
