package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.review_entity;
import com.repo.review_repo;


@Repository
public class review_dao {

	@Autowired
	private review_repo repo;
	
	
	public String getre(List<review_entity> s) {
		repo.saveAll(s);
		return "Saved Successfully";
	}


	public List<String> getrev(int d) {
		return repo.getrev(d);
	}

}
