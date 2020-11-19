package com.karthi.seleniumspring.kelvin.config;

import java.net.URL;

import com.karthi.seleniumspring.kelvin.annotations.ThreadscopeBean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.karthi.seleniumspring.kelvin.annotations.LazyConfiguration;

@LazyConfiguration
@Profile("remote")
public class RemoteWebDriverContext {
	
	
	@Value("${default.timeout:30}")
	private int timeout;
	
	@Value("${selenium.grid.url}")
	private URL gridUrl;

	@ThreadscopeBean
	@ConditionalOnProperty(name="browser", havingValue="firefox")
	public WebDriver fireFoxDriver() {
		return new RemoteWebDriver(gridUrl,DesiredCapabilities.firefox());
	}

	@ThreadscopeBean
	@ConditionalOnMissingBean
	public WebDriver chromeDriver() {
		return new RemoteWebDriver(gridUrl,DesiredCapabilities.chrome());
	}
	
	@Bean
	public WebDriverWait webDriverWait(WebDriver driver) {
		return new WebDriverWait(driver, timeout);
	}

}
