package modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pageObjects.initializePageObjects.PageFactoryInitializer;

public class SDHomePage extends PageFactoryInitializer {
    @FindBy(xpath = "//select[@data-test=\"product_sort_container\"]")
    private WebElement filterDropdown;

    @FindBy(css = "button#react-burger-menu-btn")
    private WebElement menuButton;

    @FindBy(css = "a#logout_sidebar_link")
    private WebElement LogoutButton;


    public void SelectFilter(String value){
        Select dropdwn = new Select(filterDropdown);
        dropdwn.selectByVisibleText(value);
    }

    public void Logout(){
        menuButton.click();
        LogoutButton.click();
    }
}
