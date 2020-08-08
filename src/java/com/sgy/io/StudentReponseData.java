package com.sgy.io;

import java.util.List;

import com.sgy.domain.Student;

public class StudentReponseData {
	
	private List<Student> studentList;

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentList == null) ? 0 : studentList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentReponseData other = (StudentReponseData) obj;
		if (studentList == null) {
			if (other.studentList != null)
				return false;
		} else if (!studentList.equals(other.studentList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudentReponseData [studentList=" + studentList + "]";
	}
	
}
