package com.karthi.seleniumspring.pages.google;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.karthi.seleniumspring.kelvin.annotations.PageFragment;
import com.karthi.seleniumspring.pages.BasePage;

@PageFragment
public class SearchComponent extends BasePage {

	@FindBy(name="q")
	private WebElement searchbox;
	
	@FindBy(name="btnK")
	private List<WebElement> searchButtons;
	
	public void search(final String searchText) {
		searchbox.sendKeys(searchText);
		searchbox.sendKeys(Keys.TAB);
		searchButtons.stream()
							.filter(e -> e.isDisplayed() && e.isEnabled())
							.findFirst()
							.ifPresent(WebElement::click);
	}
	
	@Override
	public boolean isAt() {
		return wait.until((d)->searchbox.isDisplayed());
	}

}
