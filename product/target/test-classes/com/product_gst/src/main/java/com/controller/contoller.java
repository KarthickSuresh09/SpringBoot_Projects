package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class contoller {

	
	@Autowired
	private RestTemplate fg;
	
	
	@GetMapping(value="/progs")
	public List<pojo> getgs() {
		String url1="http://localhost:8888/product/prod";
		String url2="http://localhost:9999/get/the/";

       List<pojo>k=fg.exchange(url1, HttpMethod.GET,null,new ParameterizedTypeReference<List<pojo>>() {}).getBody();	
                                                                
		k.forEach(x->{int tax=fg.exchange(url2+ x.getHsnno(),HttpMethod.GET,null,Integer.class).getBody();
		x.setProductprice(x.getProductprice()+x.getProductprice()+tax/100);});
		
		
return k;                                                 
	}
	
}
