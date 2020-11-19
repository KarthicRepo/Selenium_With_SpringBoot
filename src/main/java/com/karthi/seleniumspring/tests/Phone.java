package com.karthi.seleniumspring.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

@Lazy
@DependsOn("fakerbean")
@Component
public class Phone {

	private String phone;
	
	@Autowired
	private Faker faker;
	
	public Phone() {
		//this.score=1000;
		phone=faker.phoneNumber().subscriberNumber();
	}
	
	public String getPhone() {
		return phone;
	}
	
}
