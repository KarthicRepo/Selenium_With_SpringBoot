package com.karthi.seleniumspring.alltests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features",
        glue={
                "com.karthi.seleniumspring.alltests.bdd.hooks",
                "com.karthi.seleniumspring.alltests.bdd.stepdefns"
        },
        plugin = {
                "pretty",
                "html:tmp/reports/"
        },
        tags={"@Regression or @Smoke"}
        //tags={"@Smoke"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }
}
