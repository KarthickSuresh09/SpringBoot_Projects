package com.library_DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.library_Repository.library_repository;
import com.library_entity.library_entity;

@Repository
public class library_DAO {

	
	@Autowired
	 private library_repository library_repository;

public String getbook(List<library_entity>k) {
	library_repository.saveAll(k);
	
	return "Suceessfully";
	
}

   public List<library_entity> getbok() {
	  return library_repository.findAll();
	  
   }

  
public library_entity getname(int as) {
	return library_repository.getname(as);
}

public library_entity getprice(int has) {
	return library_repository.getprice(has);
}

public library_entity getlogo(char ia) {
	return library_repository.getlogo(ia);
}

public library_entity getbooks(String ai) {
	return library_repository.getbooks(ai);
}

public List<library_entity> getold(int old) {

	return library_repository.getold(old);
}
}
