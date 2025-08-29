package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.marksheet_entity;

public interface marksheet_repo extends JpaRepository <marksheet_entity,Integer>{
	
	
	@Query(value="select * from mark_sheet_db.mark_sheet where sem1total >? and  sem2total >?",nativeQuery=true)
	public List<marksheet_entity>findAll(int s,int a);

	
	@Query(value="select * from mark_Sheet where id?",nativeQuery=true)
	public marksheet_entity save(int id);





}
