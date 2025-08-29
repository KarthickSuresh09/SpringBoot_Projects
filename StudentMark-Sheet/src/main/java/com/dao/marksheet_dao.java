package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.marksheet_entity;
import com.repo.marksheet_repo;

@Repository
public class marksheet_dao {
	
	@Autowired
	private marksheet_repo repo;

	public String getput(List<marksheet_entity> k) {
		repo.saveAll(k);
		return "Saved Successfully";
	}

	public List<marksheet_entity> getget(int s,int a) {
		return repo.findAll(s,a);
	}

	public String getdelete(int id) {
		repo.deleteById(id);
		
		return "Deleted Successfully";
	}

	public marksheet_entity getputt(int id) {
         return	repo.save(id);
	}

}
