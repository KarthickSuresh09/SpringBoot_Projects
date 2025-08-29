package com.library_entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="books")
public class library_entity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private String book_name;
	private char book_logo;
	private boolean isold;
	private int book_price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public char getBook_logo() {
		return book_logo;
	}
	public void setBook_logo(char book_logo) {
		this.book_logo = book_logo;
	}
	public boolean isIsold() {
		return isold;
	}
	public void setIsold(boolean isold) {
		this.isold = isold;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	
	
	

	
 }
