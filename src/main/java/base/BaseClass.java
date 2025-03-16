package base;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utility.WebDriverConfiguration;

public class BaseClass {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverConfiguration.getInstance().openBrowser();
        WebDriverConfiguration.getInstance().navigateToURL();
        driver = WebDriverConfiguration.getInstance().getDriver();
    }

    @AfterMethod
    public void close(){
        WebDriverConfiguration.getInstance().closeBrowser();
    }

}
