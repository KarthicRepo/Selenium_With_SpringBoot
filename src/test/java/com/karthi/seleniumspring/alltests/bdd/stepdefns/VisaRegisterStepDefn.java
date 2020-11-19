package com.karthi.seleniumspring.alltests.bdd.stepdefns;

import com.karthi.seleniumspring.kelvin.annotations.LazyAutowired;
import com.karthi.seleniumspring.pages.visa.VisaRegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

import java.time.LocalDate;


@SpringBootTest
public class VisaRegisterStepDefn {

    @LazyAutowired
    private VisaRegistrationPage visaRegistrationPage;

    @Given("I am on the VISA registration form")
    public void iAmOnTheVISARegistrationForm() {
        visaRegistrationPage.goTo();
        Assert.assertTrue(visaRegistrationPage.isAt());
    }

    @When("I select my country {string} and to country {string}")
    public void iSelectMyCountryAndToCountry(String from, String to) {
        visaRegistrationPage.setCountryFromAndTo(from,to);
    }

    @And("I enter my dob as {string}")
    public void iEnterMyDobAs(String dob) {
        visaRegistrationPage.setBirthDate(LocalDate.parse(dob));
    }

    @And("I enter my name as {string} and {string}")
    public void iEnterMyNameAsAnd(String firstName, String lastName) {
        visaRegistrationPage.setNames(firstName, lastName);
    }

    @And("I enter my contact details as {string} and {string}")
    public void iEnterMyContactDetailsAsAnd(String email, String phone) {
        visaRegistrationPage.setContactDetails(email, phone);
    }

    @And("I enter comments as {string}")
    public void iEnterCommentsAs(String comments) {
        visaRegistrationPage.setComments(comments);
    }

    @And("I submit the form")
    public void iSubmitTheForm() {
        visaRegistrationPage.submit();
    }

    @Then("I should see the confirmation number")
    public void iShouldSeeTheConfirmationNumber() {
        Assert.assertTrue(!visaRegistrationPage.getConfirmationNumber().isEmpty());
    }

    //@After
    public void quit(){
        visaRegistrationPage.close();
    }
}
