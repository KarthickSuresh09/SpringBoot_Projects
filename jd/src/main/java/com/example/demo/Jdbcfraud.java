package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class Jdbcfraud implements fraudReposoitry{
	  @Autowired
	  private JdbcTemplate jdbcTemplate;
	  @Override
	  public int save(fraud tutorial) {
	    return jdbcTemplate.update("INSERT INTO tutorials (title, description, published) VALUES(?,?,?)",
	        new Object[] { tutorial.getTitle(), tutorial.getDescription(), tutorial.isPublished() });
	  }
	  @Override
	  public int update(fraud tutorial) {
	    return jdbcTemplate.update("UPDATE tutorials SET title=?, description=?, published=? WHERE id=?",
	        new Object[] { tutorial.getTitle(), tutorial.getDescription(), tutorial.isPublished(), tutorial.getId() });
	  }
	  @Override
	  public fraud findById(Long id) {
	    try {
	      fraud tutorial = jdbcTemplate.queryForObject("SELECT * FROM tutorials WHERE id=?",
	          BeanPropertyRowMapper.newInstance(fraud.class), id);
	      return tutorial;
	    } catch (IncorrectResultSizeDataAccessException e) {
	      return null;
	    }
	  }
	  @Override
	  public int deleteById(Long id) {
	    return jdbcTemplate.update("DELETE FROM tutorials WHERE id=?", id);
	  }
	  @Override
	  public List<fraud> findAll() {
	    return jdbcTemplate.query("SELECT * from tutorials", BeanPropertyRowMapper.newInstance(fraud.class));
	  }
	  @Override
	  public List<fraud> findByPublished(boolean published) {
	    return jdbcTemplate.query("SELECT * from tutorials WHERE published=?",
	        BeanPropertyRowMapper.newInstance(fraud.class), published);
	  }
	  @Override
	  public List<fraud> findByTitleContaining(String title) {
	    String q = "SELECT * from tutorials WHERE title LIKE '%" + title + "%'";
	    return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(fraud.class));
	  }
	  @Override
	  public int deleteAll() {
	    return jdbcTemplate.update("DELETE from tutorials");
	  }

}
