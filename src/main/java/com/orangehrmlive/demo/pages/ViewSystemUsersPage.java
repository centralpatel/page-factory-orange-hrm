package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSystemUsersPage extends Utility {
    public ViewSystemUsersPage() {
        PageFactory.initElements(driver, this);}

     //verify message "No Records Found
        @FindBy(xpath = "//td[normalize-space()='No Records Found']")
        WebElement noRecordsFound;

public String verifyNoRecordFound(){
    return getTextFromElement(noRecordsFound);
}



    }

