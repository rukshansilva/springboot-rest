package com.sample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rate {

	private String name;
	
	private String code;
	
	private Double rate;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * @return the rate
	 */
	public Double getRate() {
		return rate;
	}
	
	/**
	 * @param rate the rate to set
	 */
	public void setRate(Double rate) {
		this.rate = rate;
	}
}