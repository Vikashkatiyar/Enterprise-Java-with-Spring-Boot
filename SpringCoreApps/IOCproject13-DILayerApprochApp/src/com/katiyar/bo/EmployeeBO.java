package com.katiyar.bo;

public class EmployeeBO {
	//Bussiness object
	private Integer eid;
	private String ename;
	private Integer age;
	private String eaddress;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "EmployeeBO [eid=" + eid + ", ename=" + ename + ", age=" + age + ", eaddress=" + eaddress + "]";
	}

}