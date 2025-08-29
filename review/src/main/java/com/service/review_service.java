package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.review_dao;
import com.entity.review_entity;

@Service
public class review_service {

	
	@Autowired
	private review_dao dao;
	
	
	public String getre(List<review_entity> s) {
		return dao.getre(s);
	}


	public List<String> getrev(int d) {
		return dao.getrev(d);
	}

}
