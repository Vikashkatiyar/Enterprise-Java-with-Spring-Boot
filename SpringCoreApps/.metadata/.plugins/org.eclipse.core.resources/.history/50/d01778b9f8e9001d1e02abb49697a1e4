package in.ineuron.bean;

import java.util.Date;
import java.util.Map;
import java.util.Properties;

public class UniversityInfo {
	private Map<Integer, String> facultyDetails;
	private Map<String, Date> dateInfo;

	private Properties technologies;

	static {
		System.out.println("University.class file is loading...");
	}

	public void setTechnologies(Properties technologies) {
		System.out.println("UniversityInfo.setTechnologies()");
		this.technologies = technologies;
	}

	public UniversityInfo() {
		System.out.println("Constructor injection using Zero:param constructor..");
	}

	public void setFacultyDetails(Map<Integer, String> facultyDetails) {
		System.out.println("UniversityInfo.setFacultyDetails()");
		this.facultyDetails = facultyDetails;
		System.out.println(facultyDetails.getClass());
	}

	public void setDateInfo(Map<String, Date> dateInfo) {
		System.out.println("UniversityInfo.setDateInfo()");
		this.dateInfo = dateInfo;
	}

	@Override
	public String toString() {
		return "UniversityInfo [facultyDetails=" + facultyDetails + ", dateInfo=" + dateInfo + ", technologies="
				+ technologies + "]";
	}

}
