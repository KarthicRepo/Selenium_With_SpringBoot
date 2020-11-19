package com.karthi.seleniumspring.pages.flights;

import com.karthi.seleniumspring.kelvin.annotations.Page;
import com.karthi.seleniumspring.kelvin.annotations.TakeScreenshot;
import com.karthi.seleniumspring.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

@Page
public class FlightPage extends BasePage {

    @FindBy(xpath = "//nav[@id='gws-travel-header__unified-nav-header']/a/span[@class='gws-travel-header__nav-label']")
    private List<WebElement> elements;

    public void gotoUrl(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    @TakeScreenshot
    public List<String> getLabels(){
        return elements.stream()
                .map(WebElement::getText)
                .map(String::trim)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isAt() {
        return wait.until((d) -> !(elements.isEmpty()));
    }

    public void close(){
        driver.quit();
    }
}
