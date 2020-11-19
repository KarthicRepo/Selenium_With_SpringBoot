package com.karthi.seleniumspring.kelvin.config;

import com.karthi.seleniumspring.kelvin.annotations.ThreadscopeBean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.karthi.seleniumspring.kelvin.annotations.LazyConfiguration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.springframework.context.annotation.Scope;

@LazyConfiguration
//@Configuration
@Profile("!remote")
public class WebDriverContext {

	@Value("${default.timeout:30}")
	int timeout;

	// @Primary
	@ConditionalOnProperty(name = "browser", havingValue = "firefox")
	@ThreadscopeBean
	public WebDriver fireFoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}

	@ConditionalOnMissingBean
	// @ConditionalOnExpression("${total.tescases} >= 100")
	// @ConditionalOnProperty(name="browser", havingValue="chrome")
	@ThreadscopeBean
	public WebDriver chromeDriver() {
		WebDriverManager.chromiumdriver().version("85.0.4183.87").setup();
		return new ChromeDriver();
	}

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public WebDriverWait driverWait(WebDriver driver) {
		return new WebDriverWait(driver, timeout);
	}

}
