package uk.wcht.org.cucumber.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.wcht.org.pages.HomePage;
import uk.wcht.org.pages.YourHomePage;

/**
 * Created by Ankita
 */
public class HomeTestSteps {
    @Given("^I am on wcht home page$")
    public void iAmOnWchtHomePage() {
    }

    @When("^I click on close button$")
    public void iClickOnCloseButton() {
        new HomePage().clickOnCloseButton();
    }

    @And("^I click on your home link$")
    public void iClickOnYourHomeLink() {
        new HomePage().clickOnYourHomeButton();

    }

    @Then("^I should navigate to your home page successfully$")
    public void iShouldNavigateToYourHomePageSuccessfully() {
        Assert.assertEquals(new YourHomePage().getWelcomeText(), "Your home");
    }


    @And("^I am on your home page$")
    public void iAmOnYourHomePage() {
    }

    @And("^I click on your tenancy link$")
    public void iClickOnYourTenancyLink() {
        new YourHomePage().clickOnYourTenancyButton();
    }

    @Then("^I should navigate to your tenancy page successfully$")
    public void iShouldNavigateToYourTenancyPageSuccessfully() {
        Assert.assertEquals(new YourHomePage().getWelcomeText1(), "Your tenancy");
    }
}
