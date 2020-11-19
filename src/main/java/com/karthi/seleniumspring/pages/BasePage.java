package com.karthi.seleniumspring.pages;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class BasePage {

	//@Qualifier("firefox")  --> to force a bean having name 'firefox'
	@Autowired
	protected WebDriver driver;

	@Autowired
	protected WebDriverWait wait;
	
	
	@PostConstruct
	private void init() {
		PageFactory.initElements(driver, this);
	}
	
	public abstract boolean isAt();

}
