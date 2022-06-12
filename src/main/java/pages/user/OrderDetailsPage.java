package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class OrderDetailsPage extends BasePage {
    public OrderDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = " .h1.card-title")
    private WebElement confirmedOrderTxt;
    @FindBy(css = ".col-xs-4.text-sm-center:nth-child(1)")
    private WebElement productPrice;

    @FindBy(css = ".col-xs-4.text-sm-center:nth-child(2)")
    private WebElement quantity;

    @FindBy(css = ".col-sm-4 span")
    private WebElement productName;
    @FindBy(css = ".total-value.font-weight-bold :nth-child(2)")
    private WebElement productTotalPrice;
    @FindBy(css = "#order-details ul :nth-child(1)")
    private WebElement orderReference;

    @FindBy(css = ".account")
    private WebElement accountButton;

    @FindBy(css = "#delivery-address address")
    private WebElement deliveryData;




    public String getConfirmedOrderTxt() {
        return confirmedOrderTxt.getText();
    }

    public String getQuantityOfProduct() {
        return quantity.getText();
    }

    public String getProductPrice() {
        return productPrice.getText();
    }

    public String getProductName() {
        return productName.getText();
    }

    public String getProductTotalPrice() {
        return productTotalPrice.getText();
    }

    public String getOrderReference() {
        return orderReference.getText().replace("Order reference: ", "");
    }

    public OrderDetailsPage goToAccountPage() {
        click(accountButton);
        return this;
    }

    public String getDeliveryData() {
        return deliveryData.getText();
    }

}
