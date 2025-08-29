package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProductGstApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductGstApplication.class, args);
	}
  @Bean
  public RestTemplate getgst() {
	  return new RestTemplate();
  }
}
