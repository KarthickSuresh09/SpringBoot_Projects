package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.student_entity;
import com.global_exception.age;
import com.service.student_service;

@RestController
@RequestMapping(value="/stu")
public class student_controller {

	@Autowired
	private student_service service;
	
	@PostMapping(value="/post")
	public String getpost(@RequestBody List<student_entity> s) {
		return service.getpost(s);
	}
	
	
	@GetMapping(value="/get/{k}")
	public List<student_entity>getget(@PathVariable int k) throws age{
		return service.getget(k);
	}
	
	
	@PutMapping(value="/put/{id}")
	public student_entity getput(@PathVariable int id){
		return service.getput(id);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String getdel(@PathVariable int id){
		return service.getdel(id);
	}
}
