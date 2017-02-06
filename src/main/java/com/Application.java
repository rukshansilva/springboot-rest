package com;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sample.Rate;

@SpringBootApplication
public class Application {

	public static void main(String... args) {
		
		SpringApplication.run(Application.class, args);
	}

	public static List<Rate> run() throws Exception {

		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<Rate>>  airports = restTemplate.exchange("https://bitpay.com/api/rates", 
					HttpMethod.GET, null,  new ParameterizedTypeReference<List<Rate>>() { });
		
		return airports.getBody();
	}
}