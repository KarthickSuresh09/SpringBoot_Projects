package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplat {

	@Autowired
	private RestTemplate rt;
	
	@GetMapping(value="/new")
	public String getrest() {
		String url="http://localhost:9090/names?a=hell&b=hel\n";
		
		ResponseEntity<String>r=rt.exchange(url,HttpMethod.GET,null,String.class);
		
		String x=r.getBody();
		return x;
	}
	
	@GetMapping(value="/two/{a}/{b}")
	public int gets(@PathVariable int a,@PathVariable int b) {
		String url="http://localhost:9090/check/"+a+","+b;
		
	ResponseEntity<Integer>s=rt.exchange(url,HttpMethod.GET, null, Integer.class);
	int  y=s.getBody();
	return y;
	}
	
	@GetMapping(value="/z/{c}")
	public String getno(@PathVariable String c,@RequestParam String d) {
	
	String url="http://localhost:9090/y/"+c+"?password="+d;  //URL: http://localhost:8080/z/katzy?d=9999

	
	ResponseEntity<String>k=rt.exchange(url, HttpMethod.GET,null,String.class);
	String de=k.getBody();
	return de;
	}
	
	@GetMapping(value="/wik")
	public String getwiki() {
		String url="https://www.wikipedia.org/";
		ResponseEntity<String>fd=rt.exchange(url, HttpMethod.GET,null,String.class);
		String sd=fd.getBody();
		return sd;
	}
	
	@GetMapping(value="/chat")
	public String getchat() {
		String url="https://chatgpt.com/";
		
		ResponseEntity<String>ch=rt.exchange(url, HttpMethod.GET,null,String.class);
		
		String cd=ch.getBody();
		return cd;
	}
	
	@GetMapping(value="/ch")
	public List<employee_pojo> getal() {
		String url="http://localhost:8585/hi/six";
		
		ResponseEntity<List<employee_pojo>>fc=rt.exchange(url, HttpMethod.GET,null,new ParameterizedTypeReference<List<employee_pojo>>() {});

		List<employee_pojo>fcd=fc.getBody();
		return fcd;
	}
		

}