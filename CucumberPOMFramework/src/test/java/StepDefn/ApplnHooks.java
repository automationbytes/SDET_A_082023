package StepDefn;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import util.ConfigReader;
import webdriverfactory.DriverFactory;

import java.sql.Driver;

public class ApplnHooks {

    private WebDriver driver;
    private DriverFactory driverFactory;

    private ConfigReader configReader = new ConfigReader();

    @Before
    public void getBrowser(){
        driverFactory = new DriverFactory();
        driver = driverFactory.init_Driver(configReader.getConfigProp("browser"));

    }
}
