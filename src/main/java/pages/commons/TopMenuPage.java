package pages.commons;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class TopMenuPage extends BasePage {

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".user-info .hidden-sm-down")
    private WebElement signInButton;

    @FindBy(css = ".account span")
    private WebElement userName;

    @FindBy(css = "input[type='text']")
    private WebElement searchWidget;

    @FindBy(css = "button[type='submit']")
    private WebElement searchIcon;

    public void shouldClickSignInButton() {
        click(signInButton);
    }

    public String getLoggedInUserName() {
        return userName.getText();
    }

    public TopMenuPage setProductNameInSearchWidget(String productName) {
        sendKeys(searchWidget, productName);
        return this;
    }

    public TopMenuPage shouldClickSearchIcon() {
        click(searchIcon);
        return this;
    }


}
