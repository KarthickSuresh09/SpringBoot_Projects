package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="GST")
public class gst_entity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //auto increament ID

	private int id;
	private int hsnno;
	private int taxpercentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHsnno() {
		return hsnno;
	}
	public void setHsnno(int hsnno) {
		this.hsnno = hsnno;
	}
	public int getTaxpercentage() {
		return taxpercentage;
	}
	public void setTaxpercentage(int taxpercentage) {
		this.taxpercentage = taxpercentage;
	}
	
	
}
