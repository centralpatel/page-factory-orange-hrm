package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends Utility {
    public DashboardPage() {
        PageFactory.initElements(driver, this);

    }
}