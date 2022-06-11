package pages.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#quantity_wanted")
    private WebElement quantityField;

    @FindBy(css = ".add-to-cart")
    private WebElement submitButton;


    public ProductPage setQuantityField(String quantityValue) {
        sendKeysWithClear(quantityField, quantityValue);
        return this;
    }

    public ProductPage shouldClickSubmitButton() {
        click(submitButton);
        return this;
    }

}
