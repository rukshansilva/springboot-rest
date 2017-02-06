package com.sample;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Application;

@RestController
public class ApplicationRESTService {

	@RequestMapping(value = "/api/rates", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Rate> getByAirportCode() {
		
		List<Rate> rates = Collections.emptyList();
		
		try {
			rates = Application.run();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		return rates;
	}
}