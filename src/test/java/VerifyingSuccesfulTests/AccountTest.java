package VerifyingSuccesfulTests;

import BasePage.WebPage;
import DataManager.ReadDatafromJson;
import HomePage.LaunchPage;
import HomePage.LoginPage;
import HomePage.WelcomePage;
import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountTest extends WebPage {
    public LoginPage loginPage;
    public WelcomePage welcomePage;
    public ReadDatafromJson readDatafromJson;
    public LaunchPage launchPage;


    @BeforeClass
    public void initializingUrl(){
        loginPage =  new LoginPage(driver);
        welcomePage = new WelcomePage(driver);
        launchPage = new LaunchPage(driver);
        readDatafromJson = new ReadDatafromJson();
    }
    @Test
    public void verifyingThePage(){
      //  loginPage.login("standard_user","secret_sauce");
//        String actualTitle = welcomePage.getTitle();
//        Assert.assertEquals(actualTitle,"PRODUCTS");
        launchPage.login(readDatafromJson.readValueFromJson("email"),
                readDatafromJson.readValueFromJson("password"), "Passed");
        String actualErrorMessage = welcomePage.getErrorMessage();
        String expectedErrorMessage = "An internal error has occurred and has been logged.";
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
    }


