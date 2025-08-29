package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.review_entity;

public interface review_repo extends JpaRepository<review_entity,Integer> {
	
	@Query(value="select revier_name,reviver_message from Review_DB.review where book_id=?",nativeQuery=true)
	
	public List<String> getrev(int d);

}
