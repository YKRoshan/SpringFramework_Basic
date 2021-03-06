package com.Ex3_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		Employee obj = (Employee) context.getBean("emp2");
		System.out.println("Employee Age is: "+obj.getAge());
		System.out.println("Employee Address is: "+obj.getAddress().getAddress());
	}
}
