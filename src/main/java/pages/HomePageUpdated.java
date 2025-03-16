package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageUpdated {

    WebDriver driver;

    public HomePageUpdated(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);    //mendatory
    }

    public void visitHomePage(){
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }


    //1st way
//    @FindBy(how = How.LINK_TEXT, using ="REGISTER")
//    public WebElement registerBtn_ele;

    //2nd way
    @FindBy(linkText = "REGISTER")
    public WebElement registerBtn_ele;


    public void selectRegisterMenu(){
        registerBtn_ele.click();
    }

}
