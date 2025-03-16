package testCases;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePageUpdated;
import pages.RegisterPageUpdated;
import pages.RegisterSuccessPageUpdated;
import utility.WebDriverConfiguration;

public class TC001_RegisterUserTestUpdated extends BaseClass{

    @Test
    public void TC001(){
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
    }

}






