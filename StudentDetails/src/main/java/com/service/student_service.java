package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.student_dao;
import com.entity.student_entity;
import com.global_exception.age;


@Service
public class student_service {
	
	@Autowired
	private student_dao dao;

	public String getpost(List<student_entity> s) {
		return dao.getpost(s);
	}

	public List<student_entity> getget(int k) throws age {
		return dao.getget(k);
	}

	public student_entity getput(int id) {
       return dao.getput(id);

	    }

	public String getdel(int id) {
		return dao.getdel(id);
	}
	}


