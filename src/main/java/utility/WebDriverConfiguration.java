package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfiguration {

    //private WebDriver driver;

    //Reason for use ThreadLocal driver:
    //Ensure tests are independant and thread-safe (Avoid conflicts in shared resources during parallel execution)
    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
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
        //driver = new ChromeDriver();
        webDriverThreadLocal.set(new ChromeDriver());
        getDriver().manage().window().maximize();
    }
    public void navigateToURL() {
        String url = "https://demo.guru99.com/test/newtours/index.php";
        getDriver().get(url);
    }

    public WebDriver getDriver() {
        //return driver;
        return webDriverThreadLocal.get();
    }
    public void closeBrowser() {
        //driver.quit();
        getDriver().quit();
    }

}
