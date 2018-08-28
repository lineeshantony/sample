package com.barclays.student.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.student.management.dao.StudentDAO;
import com.barclays.student.management.model.Student;

@RestController
// @EnableAutoConfiguration
@RequestMapping("/studentmanagement")
public class StudentController {

	private final StudentDAO studentDAO;

	@Autowired
	public StudentController(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@RequestMapping("/greetings")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/getStudent")
	public Student getStudent(@RequestParam("rollNumber") String rollNumber) {
		return studentDAO.getStudentInfoFromRollNumber(rollNumber);
	}

	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		studentDAO.addStudentInfo(student);
		return "Success";
	}
}
