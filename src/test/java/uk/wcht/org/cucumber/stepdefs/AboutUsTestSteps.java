package uk.wcht.org.cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.wcht.org.pages.AboutUsPage;
import uk.wcht.org.pages.HomePage;
import uk.wcht.org.pages.YourHomePage;

/**
 * Created by Ankita
 */
public class AboutUsTestSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on about us link$")
    public void iClickOnAboutUsLink() {
        new HomePage().clickOnAboutUsLink();
    }

    @Then("^I should navigate to abous us page successfully$")
    public void iShouldNavigateToAbousUsPageSuccessfully() {
        Assert.assertEquals(new AboutUsPage().getWelcomeText(), "About us");

    }

    @And("^I click on jobs and careers link$")
    public void iClickOnJobsAndCareersLink() {
        new AboutUsPage().clickOnJobsAndCareersButton();
    }

    @Then("^I should navigate to jobs and careers page successfully$")
    public void iShouldNavigateToJobsAndCareersPageSuccessfully() {
        Assert.assertEquals(new AboutUsPage().getWelcomeText1(), "Work with us.");
    }
}
