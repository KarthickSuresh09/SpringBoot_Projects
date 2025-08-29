package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.bank_entity;
import com.repo.bank_repo;

@Repository
public class bank_dao {
	
	@Autowired
	private bank_repo repo;

	public String getpost(List<bank_entity> s) {
		repo.saveAll(s);
		
		return "Updated Successfully";
	}

	public String getvalue(String s) {
		return repo.getvalue(s);
	}

}
