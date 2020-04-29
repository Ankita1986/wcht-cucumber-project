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
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy (xpath = "//button[@class=\"modal__close js-modal-close\"]")
    WebElement _closeButton;

    @FindBy(xpath = "//a[@class='header__nav-area-title'][contains(text(),'Your home')]")
    WebElement yourHomeLink;

    @FindBy(linkText = "About us")
    WebElement aboutUsLink;

    public void clickOnYourHomeButton(){
        Reporter.addStepLog("Clicking On Your Home Link" + yourHomeLink.toString());
        clickOnElement(yourHomeLink);
        log.info("Clicking On Your Home Link" + yourHomeLink.toString());
    }
    public void clickOnAboutUsLink(){
        Reporter.addStepLog("Clicking On About Us Link" + aboutUsLink.toString());
        clickOnElement(aboutUsLink);
        log.info("Clicking On About Us Link" + aboutUsLink.toString());
    }

    public void clickOnCloseButton(){
        Reporter.addStepLog("Clicking on close button : " + _closeButton.toString());
        clickOnElement(_closeButton);
        log.info("Clicking on close button : " + _closeButton.toString());
    }



}
