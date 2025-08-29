package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.student_entity;

public interface student_repo extends JpaRepository<student_entity,Integer> {
	
	
@Query(value="Select * from student where age >=?",nativeQuery=true)
	public List<student_entity> findAll(int k);

	
	}
