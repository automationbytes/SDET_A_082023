package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageObjects.initializePageObjects.PageFactoryInitializer;

import static controllers.WebDriverFactory.getWebDriver;

public class GoogleHomePage  {


    @FindBy(xpath = "//textarea[@name='q']")
    WebElement googleInput;


//
//    public GoogleHomePage(WebDriver driver){
//        PageFactory.initElements(getWebDriver(),this);
//    }

public GoogleHomePage enterSearchText(String search){
    googleInput.sendKeys(search);
    return this;

}


    public GoogleHomePage verifyPageTitle(){
        System.out.println(getWebDriver().getTitle());
        Assert.assertEquals(getWebDriver().getTitle(),"Google");
        return this;

    }


}
