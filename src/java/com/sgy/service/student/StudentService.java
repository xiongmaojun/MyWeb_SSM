package com.sgy.service.student;

import java.util.List;

import com.sgy.domain.Student;

public interface StudentService {
	
	Student queryById(String id);
	
	List<Student> queryAll();

}
