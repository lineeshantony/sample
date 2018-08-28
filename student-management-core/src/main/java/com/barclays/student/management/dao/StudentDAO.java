package com.barclays.student.management.dao;

import java.util.HashMap;
import java.util.Map;

import com.barclays.student.management.model.Student;

public class StudentDAO {
	private Map<Long, Student> studentData = new HashMap<>();

	public Student getStudentInfoFromRollNumber(String rollNumber) {
		return studentData.get(Long.parseLong(rollNumber));
	}

	public void addStudentInfo(Student student) {
		studentData.put(student.getRollNumber(), student);
	}
}
