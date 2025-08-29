package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Service.employee_Service;
import com.entity.employee_entity;

@RestController
@RequestMapping(value="/hi")
public class employee_controller {

	@Autowired
	 employee_Service as;
	
	@PostMapping(value="/getemployee")
public String getemployee(@RequestBody List<employee_entity> e) {
		return as.getemp(e);
	}	
	
	@GetMapping(value="/getmax")
	public Integer Maxi() {
		return as.Maxi();
	}
	
	@PutMapping(value="/getempo")
	public Integer getempo() {
		return as.getempo();
	}
	
	@PutMapping(value="/getup")
	public String getup(@RequestBody List<employee_entity> s) {
		return as.getup(s);
	}
	
	@GetMapping(value="/hello")
	public Integer getmax() {
		return as.getmax();
	}
	
    @GetMapping(value="/jp1")
    public List<employee_entity> getjp1() {
    	return as.getjp1();
    }
    
	@GetMapping(value="/jp2")
	public  List<employee_entity> getjp2() {
		return as.getjp2();
	}
	
	
	@GetMapping(value="/jp3/{name}")
	public List<employee_entity> getjp3(@PathVariable String name){
		return as.getjp3(name);
	}
	
	@GetMapping(value="/six")
	public List<employee_entity> getsix(){
		return as.getsix();
	}
 }
