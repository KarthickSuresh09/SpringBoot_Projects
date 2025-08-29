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

import com.entity.marksheet_entity;
import com.service.marksheet_service;

@RestController
@RequestMapping(value="/re")
public class marksheet_controller {
	
	@Autowired 
	private marksheet_service service;

	@PostMapping(value="/pu")
	public String getput(@RequestBody List<marksheet_entity> k) {
		return service.getput(k);
	}
	
	@GetMapping(value="/get/{s}/{a}")
	public List<marksheet_entity> getget(@PathVariable int s,@PathVariable int a ){
		return service.getget(s,a);
	}
	
	@DeleteMapping(value="/del/{id}")
	public String getdelete(@PathVariable int id){
		return service.getdelete(id);
	}
	
	@PutMapping(value="/put/{id}")
	public marksheet_entity getputt(@PathVariable int id){
		return service.getputt(id);
	}
}
