package com.library_Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.library_entity.library_entity;

public interface library_repository  extends JpaRepository<library_entity,Integer>{

//public String getbok(List<library_entity>d);	

	@Query(value="select * from books where id=?",nativeQuery=true)
	public library_entity getname(int as);
	
	@Query(value="select * from books where book_price=?",nativeQuery=true)
	public library_entity getprice(int has);
	
	
	@Query(value="select * from books where book_logo=?",nativeQuery=true)
	public library_entity getlogo(char ia);
	
	@Query(value="select * from books where book_name=?",nativeQuery=true)
	public library_entity getbooks(String ai);
	
	@Query(value="select * from books where isold=?",nativeQuery=true)
	public List<library_entity> getold(int old);
}
