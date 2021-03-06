package com.Ex2_DIWithDependentObjectAndSetter;

public class Employee {

	Address address;

	int age;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
	}

	public Employee(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
