package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bank")
public class bank_entity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //auto increament ID
	
	private long id;
	private String name;
	private String branch;
	private String ifcs;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfcs() {
		return ifcs;
	}
	public void setIfcs(String ifcs) {
		this.ifcs = ifcs;
	}
	
	
	

}
