package com.Ex3_annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.Ex3_annotations")
/*
 * To fetch values from properties file you will need to add 
 * @@PropertySource("classpath:employee-info")
 * */
@PropertySource("classpath:employee-info")
public class ConfigClass {
	
/*
 * If we don't want to use @ComponentScan then we need to use 
 * @Bean annotation
 * 
  	@Bean("emp2")
	public Employee Employee(){
		return new Employee();
	}
	
	@Bean
	public Address Address(){
		return new Address();
	}*/
}
