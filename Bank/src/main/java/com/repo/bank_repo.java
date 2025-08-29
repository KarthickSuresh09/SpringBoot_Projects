package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.bank_entity;

public interface bank_repo extends JpaRepository <bank_entity,Integer>{
	
@Query(value="select branch from bank where ifcs=?",nativeQuery=true)

 public String getvalue(String s);

}
