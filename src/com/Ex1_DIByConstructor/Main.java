package com.Ex1_DIByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee obj = (Employee) context.getBean("emp");
		System.out.println("Employee Age is: "+obj.getAge());

	}
}
