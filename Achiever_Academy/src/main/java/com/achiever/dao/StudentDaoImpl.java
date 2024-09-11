package com.achiever.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.achiever.entity.Student;
@Component
public class StudentDaoImpl implements StudentDao {
	private String INSERT="insert into student values(?,?,?,?,?)";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void saveStudent(Student student) {
		try {
			jdbcTemplate.update(INSERT,student.getSName(),student.getSRollNo(),student.getSAge(),student.getSClass(),student.getPhoto());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
