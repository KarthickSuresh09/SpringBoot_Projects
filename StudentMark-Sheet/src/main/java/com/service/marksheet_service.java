package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.marksheet_dao;
import com.entity.marksheet_entity;

@Service
public class marksheet_service {

	@Autowired
	private marksheet_dao dao;
	
	public String getput(List<marksheet_entity> k) {
		return dao.getput(k);
	}

	public List<marksheet_entity> getget(int s,int a) {
		return dao.getget(s,a);
	}

	public String getdelete(int id) {
		return dao.getdelete(id);
	}

	public marksheet_entity getputt(int id) {
		return dao.getputt(id);
	}

}
