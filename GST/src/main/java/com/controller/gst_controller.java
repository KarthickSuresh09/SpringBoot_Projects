package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.gst_entity;
import com.service.gst_service;

@RestController
@RequestMapping(value="/get")
public class gst_controller {
	
	@Autowired
	private gst_service service;

	@PostMapping(value="/he")
	public String getGST(@RequestBody List<gst_entity>d) {
		return service.getGST(d);
	}
	
	@GetMapping(value="/the/{s}")
	public Integer getGS(@PathVariable Integer s) {
		return service.getGS(s);
	}
	
}
