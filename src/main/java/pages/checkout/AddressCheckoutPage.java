package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;

import java.util.List;

public class AddressCheckoutPage extends BasePage {
    public AddressCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name='address1']")
    private WebElement addressField;
    @FindBy(css = "[name='city']")
    private WebElement cityField;
    @FindBy(css = "[name='id_state']")
    private WebElement stateField;
    @FindBy(css = "[name='postcode']")
    private WebElement zipCodeField;

    @FindBy(css = "[name='confirm-addresses']")
    private WebElement continueButton;


    public AddressCheckoutPage setAddress(String address) {
        sendKeys(addressField, address);
        return this;
    }

    public AddressCheckoutPage setCity(String city) {
        sendKeys(cityField, city);
        return this;
    }

    public AddressCheckoutPage selectUtahState(String state) {
        stateField.click();
        new Select(stateField).selectByValue(state);
        return this;
    }

    public AddressCheckoutPage setZipCode(String zipCode) {
        sendKeys(zipCodeField, zipCode);
        return this;
    }

    public AddressCheckoutPage clickContinueButton() {
        click(continueButton);
        return this;
    }

}
