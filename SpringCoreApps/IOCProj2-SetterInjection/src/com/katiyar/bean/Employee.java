package com.katiyar.bean;

public class Employee {
	private Integer eno;
	private String ename;
	private float esalary;

	public Employee(Integer eno, String ename, float esalary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	

}
