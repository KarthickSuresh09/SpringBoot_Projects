package com.library_control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.global_expection.book_logo_exception;
import com.global_expection.book_name_exception;
import com.global_expection.book_price_exception;
import com.global_expection.id_exception;
import com.global_expection.isold_exception;
import com.library_entity.library_entity;
import com.library_service.library_service;

@RestController
@RequestMapping(value="/books")
public class library_control {

	@Autowired
	private  library_service libraryservice;
	
	@PostMapping(value="/fi")
	public String getbook(@RequestBody List<library_entity> b) {
		return libraryservice.getbook(b);
	}
	
	@GetMapping(value="/f")
	public List<library_entity> getbok() {
 return libraryservice.getbok();
	}
	
	
	@GetMapping(value="/Exception/{as}")
	public library_entity getname(@PathVariable int as) throws id_exception{
		return libraryservice.getname(as);
	}
	
	
	@GetMapping(value="/Exception1/{has}")
	public library_entity getprice(@PathVariable int has) throws book_price_exception{
		return libraryservice.getprice(has);
	}
	
	@GetMapping(value="/Exception2/{ia}")
	public library_entity getlogo(@PathVariable char ia)throws book_logo_exception{
		return libraryservice.getlogo(ia);
	}
	
	@GetMapping(value="/Exception3/{ai}")
	public library_entity getbooks(@PathVariable String ai)throws book_name_exception{
		return libraryservice.getbooks(ai);
	}
	
	@GetMapping(value="Exception4/{old}")
	public List<library_entity> getold(@PathVariable int old)throws isold_exception{
		return libraryservice.getold(old);
	}
}
