package com.katiyar.vo;

public class EmployeeVO {
	private String ename;
	private String eaddress;
	private String age;
	private String eid;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "EmployeeVO [ename=" + ename + ", eaddress=" + eaddress + ", age=" + age + ", eid=" + eid + "]";
	}
  
}
