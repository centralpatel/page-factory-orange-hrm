package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @Test
    public void verifyUserShouldLoginSuccessFully() {
        //Enter username
        loginPage.enterUser("Admin");
        //Enter password
        loginPage.enterPass("admin123");
        //Click on Login Button
        loginPage.clickOnLogIn();
        //Verify "WelCome" Message
        String expected = "Welcome Paul";
        String actual = loginPage.verifyWelcome();
        Assert.assertEquals(actual, expected, "not found");
    }

    @Test
    public void verifyThatTheLogoDisplayOnHomePage() {
        // Login To The application
        loginPage.enterUser("Admin");
        //Enter password
        loginPage.enterPass("admin123");
        //Click on Login Button
        loginPage.clickOnLogIn();
        //Verify Logo is Displayed
        Assert.assertTrue(homePage.verifyLogoDisplay());
    }

    @Test
    public void verifyUserShouldLogOutSuccessFully() {
        // Login To The application
        loginPage.enterUser("Admin");
        //Enter password
        loginPage.enterPass("admin123");
        //Click on Login Button
        loginPage.clickOnLogIn();
        //Click on User Profile logo
        homePage.setClickWelcome();
        //Mouse hover on "Logout" and click
        homePage.setLogOut();
    }

}
