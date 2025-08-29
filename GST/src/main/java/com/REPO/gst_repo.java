package com.REPO;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entity.gst_entity;

public interface gst_repo extends JpaRepository<gst_entity,Integer>{
	
	
@Query(value="SELECT taxpercentage FROM GST WHERE hsnno=?1",nativeQuery=true)


public Integer getGS(Integer s);

		
	

}
