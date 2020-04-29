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
public class YourCommunityPage extends Utility {

    private static final Logger log = LogManager.getLogger(YourCommunityPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Your community')]")
    WebElement welcomeCommunityText;


    public String getWelcomeText() {
        Reporter.addStepLog("Getting text from : " + welcomeCommunityText.toString());
        log.info("Getting text from : " + welcomeCommunityText.toString());
        return getTextFromElement(welcomeCommunityText);

    }
}
