package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.entity.customer_entity;
import com.repo.customer_repo;

@RestController
//@RequestMapping(name="/customer")
public class customer_controller {

	@Autowired
	private customer_repo repo;
	
	@Autowired
      private RestTemplate cus;
	
	@PostMapping(value="/cust")
	 public List<customer_entity> getcus(@RequestBody List<customer_entity> c) {
		
		 c.forEach(x->{
			 String url=cus.exchange("http://localhost:1111/bank/get/"+x.getIfcs(),
					 HttpMethod.GET, null, String.class).getBody();
				x.setBranch(url);			 
		 });
		
		 //"http://localhost:1111/bank/get/";
		return repo.saveAll(c);
	 }
	
	
	 
}
