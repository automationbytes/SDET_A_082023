package tests;

import controllers.WebDriverFactory;
import modules.GoogleHomePage;
import org.testng.annotations.Test;

import static controllers.WebDriverFactory.getWebDriver;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.Retry;

public class Test1 extends PageFactoryInitializer {

  //  public GoogleHomePage gp;

    @Test(retryAnalyzer = Retry.class)
    public void testGoogle(){
        googleHomePage()
                .enterSearchText("Hello")
                .verifyPageTitle();

    }
}
