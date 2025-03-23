package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.WebDriverConfiguration;

public class LoginSuccessPage {
    WebDriver driver;

    public LoginSuccessPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void visitLoginSuccessPage(){
        driver.get("https://demo.guru99.com/test/newtours/login_sucess.php");
    }

    @FindBy(xpath = "//b[normalize-space()='Thank you for Loggin.']")
    public WebElement loginSuccessText;

    public String loginSuccessText(){
        String successText = loginSuccessText.getText();
        return successText;
    }

}
