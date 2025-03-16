package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.WebDriverConfiguration;

public class LoginPage {

    WebDriver driver = WebDriverConfiguration.getInstance().getDriver();

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void visitLoginPage(){
        driver.get("https://demo.guru99.com/test/newtours/login.php");
    }

    @FindBy(xpath="//input[@name='userName']")
    public WebElement userName;
    @FindBy(xpath="//input[@name='password']")
    public WebElement password;
    @FindBy(xpath="//input[@name='submit']")
    public WebElement submit;

    public void login(String uName,String pass){
        userName.sendKeys(uName);
        password.sendKeys(pass);
        submit.click();
    }
}
