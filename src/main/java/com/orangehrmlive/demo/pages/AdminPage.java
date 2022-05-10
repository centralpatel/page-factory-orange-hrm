package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends Utility {
    public AdminPage() {PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement systemUserName;
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement systemUserRole;
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement systemStatus;
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchButton;
    @FindBy(xpath = "//input[@id='ohrmList_chkSelectRecord_30']")
    WebElement cheBox;
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteBtn;
    @FindBy(xpath = "//input[@id='dialogDeleteBtn']")
    WebElement popupOk;

    public void enterSysterUserName(String name){
        sendTextToElement(systemUserName,name);
    }
public void selectSystemUserRole(String role){
        selectByVisibleTextFromDropDown(systemUserRole,role);
}
public void selectSystemStatus(String status){
        selectByVisibleTextFromDropDown(systemStatus,status);
}
public void clickOnSearch(){
        clickOnElement(searchButton);
}
public void clickOnCheckBox(){
        clickOnElement(cheBox);
}
public void clickOnDelete(){
        clickOnElement(deleteBtn);
}
public void ClickOnpopupOk(){
        clickOnElement(popupOk);
}
}