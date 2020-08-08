package com.sgy.io;

import java.util.Date;

public class BaseResponse {
	
	private BaseReponseData baseReponseData;
	
	private Date currentTime;

	public BaseReponseData getBaseReponseData() {
		return baseReponseData;
	}

	public void setBaseReponseData(BaseReponseData baseReponseData) {
		this.baseReponseData = baseReponseData;
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((baseReponseData == null) ? 0 : baseReponseData.hashCode());
		result = prime * result + ((currentTime == null) ? 0 : currentTime.hashCode());
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
		BaseResponse other = (BaseResponse) obj;
		if (baseReponseData == null) {
			if (other.baseReponseData != null)
				return false;
		} else if (!baseReponseData.equals(other.baseReponseData))
			return false;
		if (currentTime == null) {
			if (other.currentTime != null)
				return false;
		} else if (!currentTime.equals(other.currentTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BaseResponse [baseReponseData=" + baseReponseData + ", currentTime=" + currentTime + "]";
	}
	
}
