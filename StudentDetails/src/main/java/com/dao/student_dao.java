package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.student_entity;
import com.repo.student_repo;

@Repository
public class student_dao {

	@Autowired
	private student_repo repo;
	
	
	public String getpost(List<student_entity> s) {
		
	         repo.saveAll(s);	
		return "Saved Successfully";
	}


	public List<student_entity> getget(int k) {
		return repo.findAll(k);
	}


	public student_entity getput(int id) {
		return repo.findById(id).orElse(null);
	}


	public String getdel(int id) {
		 repo.deleteById(id);
		 return "Deleted Sucessfully";
	}

}
