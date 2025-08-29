package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.bank_entity;
import com.service.bank_service;

@RestController
@RequestMapping(value="/bank")
public class back_controller {
	
	
	@Autowired
	private bank_service service;

	@PostMapping(value="/post")
	public String getpost(@RequestBody List<bank_entity>s) {
		return service.getpost(s);
	}
	
	@GetMapping(value="/get/{s}")
	public String getvalue(@PathVariable String s) {
		return service.getvalue(s);
	}
}
