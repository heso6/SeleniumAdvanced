package pages.checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

public class PaymentCheckoutPage extends BasePage {
    public PaymentCheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#payment-option-1")
    private WebElement payByCheckCheckBox;

    @FindBy(css = "[name='conditions_to_approve[terms-and-conditions]']")
    private WebElement termsAndConditionsCheckBox;

    @FindBy(css = ".btn.btn-primary.center-block")
    private WebElement placeOrderButton;


    public PaymentCheckoutPage clickPayByCheckCheckBox() {
        click(payByCheckCheckBox);
        return this;

    }

    public PaymentCheckoutPage clickTermsAndConditionsCheckBox() {
        click(termsAndConditionsCheckBox);
        return this;
    }

    public PaymentCheckoutPage clickPlaceOrderButton() {
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderButton));
        click(placeOrderButton);
        return this;
    }

}
