package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.employee_DAO;
import com.entity.employee_entity;

@Service
public class employee_Service {

	@Autowired
	employee_DAO da;
	
	public String getemp(List<employee_entity> e) {
		return da.value(e);
	}
	
	public Integer Maxi() {
		return da.Maxi();
	}
	
	public Integer getempo() {
		return da.getempo();
	}
	
	public String getup(List<employee_entity>s) {
		return da.getup(s);
	}
	
	public Integer getmax() {
		return da.getmax();
	}
	public List<employee_entity> getjp1() {
		return da.getjp1();
	}
	 public List<employee_entity> getjp2() {
		 return da.getjp2();
	 }
	 
	 public List<employee_entity> getjp3(String name) {
		 return da.getjp3();
	 }

	public List<employee_entity> getsix() {
		// TODO Auto-generated method stub
		return da.getsix();
	}
	
}
