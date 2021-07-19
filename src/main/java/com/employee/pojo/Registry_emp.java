package com.employee.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="EMPLOYEE")

public class Registry_emp {
	@Id
	@Column(name="EMPID")
	private int EmpID;
	@Column(name="EMPNAME")
	private String EmpName;
	@Column(name="EMPADD")
	private String EmpAdd;
	@Column(name="EMPGENDER")
	private String EmpGender;
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpAdd() {
		return EmpAdd;
	}
	public void setEmpAdd(String empAdd) {
		EmpAdd = empAdd;
	}
	public String getEmpGender() {
		return EmpGender;
	}
	public void setEmpGender(String empGender) {
		EmpGender = empGender;
	}
	public Registry_emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registry_emp(int empID, String empName, String empAdd, String empGender) {
		super();
		EmpID = empID;
		EmpName = empName;
		EmpAdd = empAdd;
		EmpGender = empGender;
	}
	
}
