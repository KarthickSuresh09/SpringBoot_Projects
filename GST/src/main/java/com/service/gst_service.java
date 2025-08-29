package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.gst_DAO;
import com.entity.gst_entity;

@Service
public class gst_service {

	@Autowired
	private gst_DAO dao;
	
	public String getGST(List<gst_entity>d) {
		return dao.getGST(d);
	}

	public Integer getGS(Integer s) {
		return dao.getGS(s);
	}

}
