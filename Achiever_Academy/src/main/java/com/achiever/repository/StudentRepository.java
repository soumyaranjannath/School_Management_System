package com.achiever.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.achiever.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Modifying
	@Query(value = "INSERT INTO student (srollno, sname, sage, sclass, sphoto) VALUES (:rollNo, :name, :age, :class, :photo)", 
	       nativeQuery = true)
	void saveStudent(@Param("rollNo") Integer rollNo, @Param("name") String name, @Param("age") Integer age, @Param("class") String studentClass, @Param("photo") byte[] photo);


}
