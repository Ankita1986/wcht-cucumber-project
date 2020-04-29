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
public class AboutUsPage extends Utility {

    private static final Logger log = LogManager.getLogger(AboutUsPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'About us')]")
    WebElement welcomeAboutUsText;

    @FindBy(xpath = "//h3[contains(text(),'Jobs & careers')]")
    WebElement jobsAndCareersLink;

    @FindBy(xpath = "//div[@class='large-banner__title h1']")
    WebElement welcomeJobsText;

    public String getWelcomeText() {
        Reporter.addStepLog("Getting text from : " + welcomeAboutUsText.toString());
        log.info("Getting text from : " + welcomeAboutUsText.toString());
        return getTextFromElement(welcomeAboutUsText);

    }

    public void clickOnJobsAndCareersButton() {
        Reporter.addStepLog("Clicking on Jobs And Careers link : " + jobsAndCareersLink.toString());
        clickOnElement(jobsAndCareersLink);
        log.info("Clicking on Jobs And Careers link : " + jobsAndCareersLink.toString());
    }

    public String getWelcomeText1() {
        Reporter.addStepLog("Getting text from : " + welcomeJobsText.toString());
        log.info("Getting text from : " + welcomeJobsText.toString());
        return getTextFromElement(welcomeJobsText);
    }
}
