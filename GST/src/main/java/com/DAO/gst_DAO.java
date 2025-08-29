package com.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.REPO.gst_repo;
import com.entity.gst_entity;

@Repository
public class gst_DAO {

 @Autowired
 private gst_repo repo;
 
 public String getGST(List<gst_entity>d) {
	 repo.saveAll(d);
	 
	 return "Saved Successfully";
 }

public Integer getGS(Integer s) {
	return repo.getGS(s);
}

}
