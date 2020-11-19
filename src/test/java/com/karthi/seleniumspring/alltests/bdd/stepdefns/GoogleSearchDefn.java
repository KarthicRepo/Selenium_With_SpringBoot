package com.karthi.seleniumspring.alltests.bdd.stepdefns;

import com.karthi.seleniumspring.kelvin.annotations.LazyAutowired;
import com.karthi.seleniumspring.pages.google.GooglePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

//@SpringBootTest
//@TestPropertySource(properties = "app.locale=en")
public class GoogleSearchDefn {

    @LazyAutowired
    private GooglePage googlePage;

    @Given("I am on the google page")
    public void iAmOnTheGooglePage() {
        googlePage.goTo();
    }

    @When("I enter {string} as a keyword")
    public void iEnterAsAKeyword(String key) {
        googlePage.getSearchComponent().search(key);
    }

    @Then("I should be on the search result page")
    public void iClickOnTheSearchButton() {
        Assert.assertTrue(googlePage.getSearchResult().isAt());
    }

    @Then("I should see at least {int} results")
    public void iShouldSeeAtLeastResults(int count) {
        Assert.assertTrue(googlePage.getSearchResult().getCount()>=count);
    }

    //@After
    public void quit(){
        googlePage.close();
    }
}
