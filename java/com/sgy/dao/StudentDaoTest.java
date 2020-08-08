package com.sgy.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sgy.domain.Student;

public class StudentDaoTest extends BaseTest{

	@Autowired
	private StudentDao studentDao;
	
	@Test
	public void testQueryById() {
		String id = "00001";
		Student student = studentDao.queryById(id);
		System.out.println(student.toString());
	}
	
	@Test
	public void testQueryAll() {
		System.out.println("123");
		List<Student> student = studentDao.queryAll();
		System.out.println(student.size());
	}
	
}
