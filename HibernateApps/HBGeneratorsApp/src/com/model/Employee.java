package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author vikash katiyar
 *
 */
@Entity
@Table(name="empTable")
public class Employee {

	
	 
	/*
	 * @Id
	 * 
	 * @Column(name = "eid")
	 * 
	 * @GenericGenerator(name = "gen1", strategy = "increment")
	 * 
	 * @GeneratedValue(generator = "gen1")
	 */
	
	
	
	@Id
	@Column(name = "eid")
	@GenericGenerator(name = "gen1", strategy = "identity")
	@GeneratedValue(generator = "gen1")
	private int empId;

	@Column(name = "ename", length = 20)
	private String empName;

	@Column(name = "esal")
	private Double empSal;

	static {
		System.out.println("Employee.class is loading...");
	}

	public Employee() {
		System.out.println("Zero parameter consturctor is used by Hibernate....");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEnpName() {
		return empName;
	}

	public void setEmpName(String enpName) {
		this.empName = enpName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", enpName=" + empName + ", empSal=" + empSal + "]";
	}

	

}
