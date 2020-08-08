package com.sgy.dao;

import java.util.List;

import com.sgy.domain.Student;

public interface StudentDao {

	Student queryById(String id);
	
	List<Student> queryAll();
}
