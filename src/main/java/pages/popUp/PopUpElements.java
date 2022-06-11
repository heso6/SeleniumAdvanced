package pages.popUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;
import pages.product.ProductPage;

public class PopUpElements extends BasePage {
    public PopUpElements(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "a.btn.btn-primary")
    private WebElement proceedToCheckoutButton;

    public PopUpElements shouldClickProceedToCheckoutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutButton));
        click(proceedToCheckoutButton);
        return this;

    }
}
