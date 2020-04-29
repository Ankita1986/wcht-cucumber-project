package uk.wcht.org.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.wcht.org.utility.Utility;

/**
 * Created by Ankita
 */
public class YourHomePage extends Utility {

    private static final Logger log = LogManager.getLogger(YourHomePage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Your home')]")
    WebElement welcomeText;

    @FindBy(xpath = "//h3[contains(text(),'Your tenancy')]")
    WebElement yourTenancyLink;

    @FindBy(xpath = "//h1[@class='inner-banner__title']")
    WebElement welcomeYourTenancyText;


    public String getWelcomeText() {
        Reporter.addStepLog("Getting text from : " + welcomeText.toString());
        log.info("Getting text from : " + welcomeText.toString());
        return getTextFromElement(welcomeText);

    }

    public void clickOnYourTenancyButton() {
        Reporter.addStepLog("Clicking On Your Tenancy Link :" + yourTenancyLink.toString());
        clickOnElement(yourTenancyLink);
        log.info("Clicking On Your Tenancy Link :" + yourTenancyLink.toString());


    }

    public String getWelcomeText1() {
        Reporter.addStepLog("Getting text from : " + welcomeYourTenancyText.toString());
        log.info("Getting text from : " + welcomeYourTenancyText.toString());
        return getTextFromElement(welcomeYourTenancyText);

    }
}
