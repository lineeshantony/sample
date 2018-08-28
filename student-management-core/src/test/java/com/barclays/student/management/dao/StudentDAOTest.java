package com.barclays.student.management.dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.barclays.student.management.model.Student;

public class StudentDAOTest {

	private StudentDAO studentDAO;

	@Before
	public void setup() {
		studentDAO = new StudentDAO();
	}

	@Test
	public void test_getStudentInfoFromRollNumber_ToReturnNull_WhenInvokedWithRollNumberNotPresent() {
		Assert.assertNull(studentDAO.getStudentInfoFromRollNumber("1"));
	}
	
	@Test
	public void test_getStudentInfoFromRollNumber_ToReturnStudent_WhenInvokedWithRollNumber() {
		Student student = new Student();
		student.setRollNumber(1);
		studentDAO.addStudentInfo(student);
		Assert.assertEquals(1, studentDAO.getStudentInfoFromRollNumber("1").getRollNumber());
	}
	
	@Test
	public void test_addStudentInfo_ToAddStudent_WhenStudentIsGiven() {
		Student student = new Student();
		student.setRollNumber(1);
		studentDAO.addStudentInfo(student);
		Assert.assertEquals(1, studentDAO.getStudentInfoFromRollNumber("1").getRollNumber());
	}

}
