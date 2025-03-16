package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfiguration {
    private WebDriver driver;
    private static WebDriverConfiguration myObj;

    public static WebDriverConfiguration getInstance() {
        if (myObj == null) {
            myObj = new WebDriverConfiguration();
            return myObj;
        } else {
            return myObj;
        }
    }

    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void navigateToURL() {
        String url = "https://demo.guru99.com/test/newtours/index.php";
        driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }
    public void closeBrowser() {
        driver.quit();
    }

}
