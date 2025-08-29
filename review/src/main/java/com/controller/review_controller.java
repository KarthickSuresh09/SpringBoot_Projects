package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.review_entity;
import com.service.review_service;

@RestController
@RequestMapping(value="/review")
public class review_controller {

	
	@Autowired
	private review_service service;
	
	
	
	@PostMapping(value="/b")
	public String getre(@RequestBody List<review_entity>s) {
		return service.getre(s);
	}
	
	
	@GetMapping(value="/c/{d}")
	public List<String> getrev(@PathVariable int d) {
		return service.getrev(d);
	}
}
