package com.achiever.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.achiever.model.Student;
import com.achiever.model.StudentLoginRequest;
import com.achiever.service.StudentService;
@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:4000")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student savedStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
	@GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer id) {
        Optional<Student> student = studentService.getStudentById(id);
        return student.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }
	
	@GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteStudentById(@PathVariable Integer id){
		String message=studentService.deleteStudent(id);
		
		if (message.contains("deleted successfully")) {
	        return new ResponseEntity<>(message, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
	    }
	}
	
	@PostMapping("/login")
    public ResponseEntity<String> loginStudent(@RequestBody StudentLoginRequest loginRequest) {
        Optional<Student> studentOpt = studentService.getStudentById(loginRequest.getRollNo());

        if (studentOpt.isPresent()) {
            Student student = studentOpt.get();
            if (student.getSAge().equals(loginRequest.getPwd())) { 
                return ResponseEntity.ok("Login successful");
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid roll number or password");
    }
	
}
