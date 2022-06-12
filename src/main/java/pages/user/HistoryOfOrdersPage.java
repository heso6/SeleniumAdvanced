package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class HistoryOfOrdersPage extends BasePage {
    public HistoryOfOrdersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "tbody th")
    private WebElement orderReference;

    @FindBy(css = ".text-sm-center.order-actions :nth-child(1)")
    private WebElement orderDetails;

    @FindBy(css = ".col-xs-9")
    private WebElement orderReferenceOnOrderDetailsPage;

    public String getOrderReference() {
        return orderReference.getText();
    }

    public HistoryOfOrdersPage getOrderDetails() {
        click(orderDetails);
        return this;
    }

    public String getOrderReferenceOnOrderDetailsPage() {
        return orderReferenceOnOrderDetailsPage.getText();
    }


}
