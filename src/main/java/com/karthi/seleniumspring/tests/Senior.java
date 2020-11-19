package com.karthi.seleniumspring.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Senior {

	@Autowired
	private Salary sal;
	
	public void printSalary() {
		System.out.println("Senior Salary: "+sal.getSalary());
	}
	
	public void increment(int inc) {
		sal.incrementSalary(inc);
	}

}
