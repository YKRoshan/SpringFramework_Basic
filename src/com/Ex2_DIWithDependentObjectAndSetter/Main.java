package com.Ex2_DIWithDependentObjectAndSetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee obj = (Employee) context.getBean("emp1");
		System.out.println("Employee Age is: "+obj.getAge());
		System.out.println("Employee Address is: "+obj.getAddress().getAddress());
	}
}
