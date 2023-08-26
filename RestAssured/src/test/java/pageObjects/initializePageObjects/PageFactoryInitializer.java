package pageObjects.initializePageObjects;

import controllers.WebDriverFactory;
import modules.GoogleHomePage;
import modules.SDHomePage;
import modules.SDLoginPage;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryInitializer extends WebDriverFactory {

    public GoogleHomePage googleHomePage(){
        return PageFactory.initElements(getWebDriver(),GoogleHomePage.class);
    }

    public SDHomePage sdHomePage(){
        return PageFactory.initElements(getWebDriver(),SDHomePage.class);
    }

    public SDLoginPage sdLoginPage(){
        return PageFactory.initElements(getWebDriver(),SDLoginPage.class);
    }




}
