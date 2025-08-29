package com.library_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.global_expection.book_logo_exception;
import com.global_expection.book_name_exception;
import com.global_expection.book_price_exception;
import com.global_expection.id_exception;
import com.global_expection.isold_exception;
import com.library_DAO.library_DAO;
import com.library_entity.library_entity;

@Service
public class library_service {

	
	@Autowired
	private   library_DAO libraryDAO;
	
	public String getbook(List<library_entity>c) {
		return libraryDAO.getbook(c);
	}
	
	
	public List<library_entity> getbok() {
		return libraryDAO.getbok();
	}
	
	
	public library_entity getname(int as) throws id_exception {
	//return libraryDAO.getname(as);
	if(libraryDAO.getname(as)==null) {
		throw new id_exception("NOT FOUND");
	}	
	else {
		return libraryDAO.getname(as);
	}
		
	}
	public library_entity getprice(int has)throws book_price_exception{
		if(libraryDAO.getprice(has)==null) {
			throw new book_price_exception("No Details");
		}
		else {
			return libraryDAO.getprice(has);
		}
	}
	
	public library_entity getlogo(char ia)throws book_logo_exception{
		if(libraryDAO.getlogo(ia)==null) {
			throw new book_logo_exception("No Data Found");
		}
		else {
			return libraryDAO.getlogo(ia);
		}
	}


	public library_entity getbooks(String ai) throws book_name_exception{
	if(libraryDAO.getbooks(ai)==null) {
		throw new book_name_exception("No Data Available");
	}
	else {
		return libraryDAO.getbooks(ai);
	}
	}


	public List<library_entity> getold(int old) throws isold_exception{
        if(libraryDAO.getold(old)==null || libraryDAO.getold(old).isEmpty()) {
        	throw new isold_exception("No Data");
        }
        else {
        	return libraryDAO.getold(old);
        }
	}
	
}
