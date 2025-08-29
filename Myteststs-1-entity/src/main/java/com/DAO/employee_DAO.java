package com.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Repository.employeeRepository;
import com.entity.employee_entity;

@Repository
public class employee_DAO {

	@Autowired
	employeeRepository er;
	
	public String value(List<employee_entity> e) {
	 er.saveAll(e);
	 
	 return "Saved Successfully";
	}
	
    public Integer Maxi() {
		return er.Maxi();
	}
    
    public Integer getempo() {
    	return er.getempo();
    }
	
    public String getup(List<employee_entity> s) {
    	 er.saveAll(s);
    	 
    	 return "update Successfully";
    }
    
    public Integer getmax() {
    	return er.Maxi();
    }
    
    public String getjp(List<employee_entity> j) {
    	er.saveAll(j);
    	return "Successfully getted";
    }
    
    public List<employee_entity> getjp1() {
    	
    	return er.getjp1();
    }
public List<employee_entity> getjp2() {
	return er.getjp2();
}

public List<employee_entity> getjp3() {
	return getjp3();
}

public List<employee_entity> getsix() {
	// TODO Auto-generated method stub
	return er.findAll();
}
	
}
