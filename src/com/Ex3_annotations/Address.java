package com.Ex3_annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	/*
	 * To fetch values from properties file you will need to add 
	 * @PropertySource("classpath:employee-info") in configClass
	 * 
	 * */
	@Value("${employee.address}")
	String address;

	public String getAddress() {
		return address;
	}

/*	public void setAddress(String address) {
		this.address = address;
	}*/

}
