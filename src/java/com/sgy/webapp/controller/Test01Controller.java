package com.sgy.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sgy.domain.Student;
import com.sgy.io.BaseReponseData;
import com.sgy.io.BaseResponse;
import com.sgy.io.StudentReponseData;
import com.sgy.io.StudentResponse;
import com.sgy.service.student.StudentService;

@Controller
@RequestMapping("/home")
public class Test01Controller {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/student" , method=RequestMethod.GET, produces= {"application/json;charset=utf-8"})
	public ResponseEntity<StudentResponse> getStudent(){
		StudentResponse studentResponse = new StudentResponse();
		BaseResponse baseResponse = new BaseResponse();
		List<Student> studentList = studentService.queryAll();
		StudentReponseData studentReponseData = new StudentReponseData();
		studentReponseData.setStudentList(studentList);
		BaseReponseData baseReponseData = new BaseReponseData();
		baseReponseData.setCode("200");
		baseReponseData.setMessage("success");
		baseResponse.setBaseReponseData(baseReponseData);
		studentResponse.setBaseResponse(baseResponse);
		studentResponse.setStudentReponseData(studentReponseData);
		return new ResponseEntity<>(studentResponse,HttpStatus.OK);
	}

}
