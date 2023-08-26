package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.ExcelReader;
import utils.LoggerUtil;

public class TestSauceDemo extends PageFactoryInitializer {

    @Test(alwaysRun = true)
    public void urlTest(){
        LoggerUtil.logInfo("urlTest running");
        String pageTitle = sdLoginPage().pageTitle();
        LoggerUtil.logInfo("Assertion of page");
        Assert.assertEquals(pageTitle,"Swag Labs");
    }

  //  @Test(dependsOnMethods = "urlTest",priority = 1)
    public void lowtoHigh(){
        sdLoginPage()
                .enterUsername(ExcelReader.getExcelData("SauceLabs_L2H","Username"))
                .enterPassword(ExcelReader.getExcelData("SauceLabs_L2H","Password"))
                .clickLogin();

        sdHomePage().SelectFilter(ExcelReader.getExcelData("SauceLabs_L2H","FilterOptions"));
        sdHomePage().Logout();
    }


    //@Test(dependsOnMethods = "urlTest",priority = 2)
    public void hightoLow(){

        sdLoginPage()
                .enterUsername(ExcelReader.getExcelData("SauceLabs_L2H","Username"))
                .enterPassword(ExcelReader.getExcelData("SauceLabs_L2H","Password"))
                .clickLogin();

        sdHomePage().SelectFilter(ExcelReader.getExcelData("SauceLabs_H2L","FilterOptions"));
        sdHomePage().Logout();
    }


    @Test(dependsOnMethods = "urlTest",priority = 3)
    public void nameA2Z(){


        sdLoginPage()
                .enterUsername(ExcelReader.getExcelData("SauceLabs_L2H","Username"))
                .enterPassword(ExcelReader.getExcelData("SauceLabs_L2H","Password"))
                .clickLogin();

        sdHomePage().SelectFilter(ExcelReader.getExcelData("SauceLabs_A2Z","FilterOptions"));
        sdHomePage().Logout();

    }
}
