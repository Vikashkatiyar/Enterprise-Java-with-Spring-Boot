package com.katiyar.bean;

import java.util.Map;
import java.util.Date;

public class UniversityInfo {
	private Map<Integer, String> facultyDetails;
	private Map<String, Date> dateInfo;

	static {
		System.out.println("University.class is loading.....");
	}

	public UniversityInfo() {
		System.out.println("Constructor injection using Zero:param Constructor...");
	}

	public void setFacultyDetails(Map<Integer, String> facultyDetails) {
		this.facultyDetails = facultyDetails;
	}

	public void setDateInfo(Map<String, Date> dateInfo) {
		this.dateInfo = dateInfo;
	}

	@Override
	public String toString() {
		return "UniversityInfo [facultyDetails=" + facultyDetails + ", dateInfo=" + dateInfo + "]";
	}

}
