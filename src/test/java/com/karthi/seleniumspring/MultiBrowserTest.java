package com.karthi.seleniumspring;

import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.testng.annotations.Test;

public class MultiBrowserTest extends BaseSpringTestNG {

    @Autowired
    ApplicationContext ctx;

    @Test
    public void multiBrowserTest(){
        ctx.getBean("fireFoxDriver", WebDriver.class).get("http://www.yahoo.com");
        ctx.getBean("chromeDriver", WebDriver.class).get("http://www.facebook.com");
    }
}
