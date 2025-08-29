package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Review")
public class review_entity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String revier_name;
	private String reviver_message;
	private int book_ID;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRevier_name() {
		return revier_name;
	}
	public void setRevier_name(String revier_name) {
		this.revier_name = revier_name;
	}
	public String getReviver_message() {
		return reviver_message;
	}
	public void setReviver_message(String reviver_message) {
		this.reviver_message = reviver_message;
	}
	public int getBook_ID() {
		return book_ID;
	}
	public void setBook_ID(int book_ID) {
		this.book_ID = book_ID;
	}
	
	
	
	

}
