package com.karthi.seleniumspring.alltests.bdd.hooks;

import com.karthi.seleniumspring.kelvin.annotations.LazyAutowired;
import com.karthi.seleniumspring.kelvin.service.ScreenshotService;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

public class CucumberHooks {

    @LazyAutowired
    ScreenshotService screenshotService;

    @LazyAutowired
    ApplicationContext ctx;

    @AfterStep
    public void afterStep(Scenario scenario) throws IOException {
        System.out.println("FAILED");
        if(scenario.isFailed()){
            scenario.embed(screenshotService.getScreenShot(),"image/png",scenario.getName());
        }
    }

    @After
    public void afterScenario(){
        ctx.getBean(WebDriver.class).quit();
    }
}
