package com.karthi.seleniumspring.pages.google;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.karthi.seleniumspring.kelvin.annotations.PageFragment;
import com.karthi.seleniumspring.pages.BasePage;

@PageFragment
public class SearchResults extends BasePage{

	@FindBy(css="div.rc")
	List<WebElement> results;
	
	public int getCount() {
		return results.size();
	}
	
	@Override
	public boolean isAt() {
		return wait.until((d)-> !results.isEmpty());
	}
	

}
