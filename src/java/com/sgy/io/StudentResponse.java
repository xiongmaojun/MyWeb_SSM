package com.sgy.io;

public class StudentResponse {
	
	private BaseResponse baseResponse;
	
	private StudentReponseData studentReponseData;

	public BaseResponse getBaseResponse() {
		return baseResponse;
	}

	public void setBaseResponse(BaseResponse baseResponse) {
		this.baseResponse = baseResponse;
	}

	public StudentReponseData getStudentReponseData() {
		return studentReponseData;
	}

	public void setStudentReponseData(StudentReponseData studentReponseData) {
		this.studentReponseData = studentReponseData;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((baseResponse == null) ? 0 : baseResponse.hashCode());
		result = prime * result + ((studentReponseData == null) ? 0 : studentReponseData.hashCode());
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
		StudentResponse other = (StudentResponse) obj;
		if (baseResponse == null) {
			if (other.baseResponse != null)
				return false;
		} else if (!baseResponse.equals(other.baseResponse))
			return false;
		if (studentReponseData == null) {
			if (other.studentReponseData != null)
				return false;
		} else if (!studentReponseData.equals(other.studentReponseData))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StudentResponse [baseResponse=" + baseResponse + ", studentReponseData=" + studentReponseData + "]";
	}
	
}
