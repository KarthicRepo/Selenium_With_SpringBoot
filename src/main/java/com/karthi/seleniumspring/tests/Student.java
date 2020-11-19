package com.karthi.seleniumspring.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Student {
	
	@Autowired
	private Address  address;
	
	@Autowired
	private Phone marks;
	
//	public Student(Address address, Phone marks) {
//		this.address=address;
//		this.marks=marks;
//	}
	
	public void printDetails() {
		System.out.println("The address is :"+address.getStreet());
		System.out.println("The phone is :"+marks.getPhone());
	}
	

}
