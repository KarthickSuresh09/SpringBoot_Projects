package com.entity;

import org.springframework.data.jpa.repository.Query;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")  // Table name in DB
public class employee_entity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)   // Auto-increment
	
	private long employeeId;
	private String employeename;

	private int emloyeeSalary;
	

	
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmloyeeSalary() {
		return emloyeeSalary;
	}
	public void setEmloyeeSalary(int emloyeeSalary) {
		this.emloyeeSalary = emloyeeSalary;
	}
	
	
}
