package com.example.demo;

import java.util.List;


public interface fraudReposoitry {
	  int save(fraud book);
	  int update(fraud book);
	  fraud findById(Long id);
	  int deleteById(Long id);
	  List<fraud> findAll();
	  List<fraud> findByPublished(boolean published);
	  List<fraud> findByTitleContaining(String title);
	  int deleteAll();

}
