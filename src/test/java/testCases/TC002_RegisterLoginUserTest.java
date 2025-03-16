package testCases;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utility.WebDriverConfiguration;


public class TC002_RegisterLoginUserTest extends BaseClass {


    @Test
    public void TC002(){
        HomePageUpdated homePage = new HomePageUpdated(driver);
        homePage.selectRegisterMenu();

        RegisterPageUpdated registerPage = new RegisterPageUpdated(driver);
        registerPage.setFirstName("Mohamed");
        registerPage.setLastName("Hashir");
        registerPage.setEmail("hashirhasmy111@gmail.com");
        registerPage.selectCountry();
        registerPage.setUserName("Mhashir");
        registerPage.setPassword("pass");
        registerPage.setConfirmPassword("pass");
        registerPage.submit();

        RegisterSuccessPageUpdated registerSuccessPage = new RegisterSuccessPageUpdated(driver);
        String ActualText = registerSuccessPage.registerSuccessText();
        Assert.assertTrue(ActualText.contains("Dear"),"Registration Attempt failed");
        registerSuccessPage.clickSignInBtn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Mhashir","pass");

        LoginSuccessPage loginSuccessPage = new LoginSuccessPage(driver);
        String actualSuccessText = loginSuccessPage.loginSuccessText();
        Assert.assertTrue(actualSuccessText.contains("Thank you for Loggin"),"Login Attempt failed");
    }

}
