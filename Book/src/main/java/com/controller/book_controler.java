package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.entity.book_entity;
import com.repo.book_repo;

@RestController
public class book_controler {

	@Autowired
	private book_repo repo;

	@Autowired
	private RestTemplate bok;

	@PostMapping(value = "/book")
	public List<book_entity> getbooks(@RequestBody List<book_entity> k) {

		k.forEach(x -> {
			String url = bok
					.exchange("http://localhost:5454/review/c/" + x.getBook_id(), HttpMethod.GET, null, String.class)
					.getBody();
			x.setBook_id(url);
		});

		return repo.saveAll(k);
	}
}
