package com.barclays.student.management.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.barclays.student.management.dao.StudentDAO;
import com.barclays.student.management.model.Student;

public class StudentControllerTest {

	private StudentDAO studentDAO;
	private StudentController studentController;

	@Before
	public void setup() {
		studentDAO = mockStudentDao();
		studentController = new StudentController(studentDAO);
	}

	@Test
	public void test_getStudent_ToReturnStudent_WhenInvokedWithRollNumber() {
		Student student = studentController.getStudent("1");
		Assert.assertEquals(1, student.getRollNumber());

	}
	
	@Test
	public void test_addNewStudent_ToAddStudent_WhenStudentIsGiven() {
		Assert.assertEquals("Success", studentController.addStudent(new Student()));
	}

	private StudentDAO mockStudentDao() {
		return new StudentDAO() {
			public Student getStudentInfoFromRollNumber(String rollNumber) {
				Student student = new Student();
				student.setRollNumber(1);
				return student;
			}
			
			public void addStudentInfo(Student student) {
			}
		};
	}

}
