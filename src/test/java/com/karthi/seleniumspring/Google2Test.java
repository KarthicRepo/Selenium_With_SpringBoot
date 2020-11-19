package com.karthi.seleniumspring;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.karthi.seleniumspring.kelvin.annotations.LazyAutowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;
import com.karthi.seleniumspring.kelvin.service.ScreenshotService;
import com.karthi.seleniumspring.pages.google.GooglePage;

public class Google2Test extends BaseSpringTestNG {

	@LazyAutowired
	GooglePage googlePage;

	@LazyAutowired
	ScreenshotService screenshotService;
	
	@Test
	public void googleTest() throws IOException {
		
		googlePage.goTo();
		Assert.assertTrue(googlePage.isAt());
		
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		
		googlePage.getSearchComponent().search("scating boot");
		Assert.assertTrue(googlePage.getSearchResult().isAt());
		Assert.assertTrue(googlePage.getSearchResult().getCount()>2);
		screenshotService.takeScreenShot();
		googlePage.close();
	}
	
}
