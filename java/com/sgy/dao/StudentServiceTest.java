package com.sgy.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sgy.domain.Student;
import com.sgy.service.student.StudentService;

public class StudentServiceTest extends BaseTest{

	@Autowired
	private StudentService studentService;
	
	@Test
	public void testQueryById() {
		String id = "00001";
		Student student = studentService.queryById(id);
		System.out.println(student.toString());
	}
	
	@Test
	public void testQueryAll() {
		System.out.println("123");
		List<Student> student = studentService.queryAll();
		System.out.println(student.size());
	}
	
}
