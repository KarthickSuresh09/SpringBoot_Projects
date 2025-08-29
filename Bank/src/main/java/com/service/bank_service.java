package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.bank_dao;
import com.entity.bank_entity;

@Service
public class bank_service {
	
	@Autowired
	private bank_dao dao;

	public String getpost(List<bank_entity> s) {

		return dao.getpost(s);
	}

	public String getvalue(String s) {
		return dao.getvalue(s);
	}
	
	

}
