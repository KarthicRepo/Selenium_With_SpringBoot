package com.karthi.seleniumspring.tests;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Salary {
	
	private int salary = 100;
	
	public int getSalary() {
		return salary;
	}
	
	public void incrementSalary(int increment) {
		this.salary+=increment;
	}
	

}
