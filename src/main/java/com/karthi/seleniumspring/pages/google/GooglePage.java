package com.karthi.seleniumspring.pages.google;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.karthi.seleniumspring.kelvin.annotations.Page;
import com.karthi.seleniumspring.pages.BasePage;

@Page
public class GooglePage extends BasePage {
	
	@Autowired
	private SearchComponent searchComponent;
	
	@Autowired
	private SearchResults searchResult;
	
	@Value("${application.url}")
	private String url;
	
	public void goTo() {
		driver.get(url);
	}
	
	public SearchComponent getSearchComponent() {
		return searchComponent;
	}

	public SearchResults getSearchResult() {
		return searchResult;
	}

	@Override
	public boolean isAt() {
		return searchComponent.isAt();
	}
	
	public void close() {
		driver.close();
	}

}
