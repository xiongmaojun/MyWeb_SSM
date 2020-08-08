package com.sgy.serviceImpl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgy.dao.StudentDao;
import com.sgy.domain.Student;
import com.sgy.service.student.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public Student queryById(String id) {
		if(StringUtils.isEmpty(id)) {
			return null;
		}
		return studentDao.queryById(id);
	}

	@Override
	public List<Student> queryAll() {
		return studentDao.queryAll();
	}

}
