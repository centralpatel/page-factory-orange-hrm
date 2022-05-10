package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//img[@alt='OrangeHRM']")
    WebElement logoDisplay;
    @FindBy(id ="welcome")
    WebElement clickWelcome;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logOut;

    public boolean verifyLogoDisplay(){
        return logoDisplay.isDisplayed();
    }
    public void setClickWelcome(){
        clickOnElement(clickWelcome);
    }
    public void setLogOut(){
        mouseHoverToElementAndClick(logOut);
    }
}
