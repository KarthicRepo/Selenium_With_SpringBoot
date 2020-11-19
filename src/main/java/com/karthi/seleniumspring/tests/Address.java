package com.karthi.seleniumspring.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Lazy
@DependsOn("fakerbean")
@Component
public class Address {

	private String street;
	
	@Autowired
	private Faker faker;

	public Address() {
		//this.street = "132 Madiwala BTM layout";
		street = faker.address().fullAddress();
	}

	public String getStreet() {
		return street;
	}

}
