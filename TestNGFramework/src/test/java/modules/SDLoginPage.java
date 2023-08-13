package modules;

import controllers.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SDLoginPage extends WebDriverFactory {

    @FindBy(xpath = "//input[@id=\"user-name\"]")
    WebElement username_WebEdit;

    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement password_WebEdit;

    @FindBy(xpath = "//input[@id=\"login-button\"]")
    WebElement login_button;


    public SDLoginPage enterUsername(String user){
        username_WebEdit.sendKeys(user);
        return this;
    }


    public SDLoginPage enterPassword(String passwrd){
        password_WebEdit.sendKeys(passwrd);
        return this;
    }


    public SDLoginPage clickLogin(){
        login_button.click();
        return this;
    }

    //common steps
    public String pageTitle(){
        return getWebDriver().getTitle();
    }
}
