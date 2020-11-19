package com.karthi.seleniumspring.tests;

public class SalaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Senior senior = new Senior();
	Junior junior= new Junior();
	senior.printSalary();
	junior.printSalary();
	
	senior.increment(200);
	
	senior.printSalary();
	junior.printSalary();
	
	}

}
