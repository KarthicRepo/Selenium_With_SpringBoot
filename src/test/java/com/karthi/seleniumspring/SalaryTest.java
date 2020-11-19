package com.karthi.seleniumspring;

import org.springframework.beans.factory.annotation.Autowired;

import com.karthi.seleniumspring.tests.Junior;
import com.karthi.seleniumspring.tests.Senior;
import org.testng.annotations.Test;

public class SalaryTest extends BaseSpringTestNG {

	@Autowired
	Senior senior;
	
	@Autowired
	Junior junior;
	
	@Test
	public void testSalary() {
		senior.printSalary();
		junior.printSalary();
		
		senior.increment(200);
		
		senior.printSalary();
		junior.printSalary();
	}
}
