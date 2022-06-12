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

    @FindBy(css = "#category-3")
    private WebElement clothesCategory;

    @FindBy(css = "#category-6")
    private WebElement accessoriesCategory;
    @FindBy(css = "#category-9")
    private WebElement artCategory;

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

    public TopMenuPage clickClothesCategory() {
        click(clothesCategory);
        return this;
    }
    public TopMenuPage clickAccessoriesCategory() {
        click(accessoriesCategory);
        return this;
    }
    public TopMenuPage clickArtCategory() {
        click(artCategory);
        return this;
    }


}
