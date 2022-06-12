package pages.shoppingCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;
import pages.popUp.PopUpElements;

public class ShoppingCartPage extends BasePage {
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[class='product-line-info']")
    private WebElement productNameInSHoppingCart;

    @FindBy(css = ".js-cart-line-product-quantity.form-control")
    private WebElement quantityOfProductInSHoppingCart;

    @FindBy(css = ".current-price .price")
    private WebElement priceForOneProduct;

    @FindBy(css = "[class='product-price']")
    private WebElement totalPriceWithoutShipping;

    @FindBy(css = ".remove-from-cart")
    private WebElement removeFromBasketButton;

    @FindBy(css = ".no-items")
    private WebElement textFromEmptyCart;

    @FindBy(css = "a.btn.btn-primary")
    private WebElement proceedToCheckoutButton;


    public ShoppingCartPage shouldClickProceedToCheckoutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutButton));
        click(proceedToCheckoutButton);
        return this;

    }


    public String getProductNameFromShoppingCart() {
        return productNameInSHoppingCart.getText();
    }

    public String getQuantityOfProduct() {
        return quantityOfProductInSHoppingCart.getAttribute("value");
    }

    public String getPriceOfOneProduct() {
        return priceForOneProduct.getText();
    }

    public String getTotalPriceWithoutSipping() {
        return totalPriceWithoutShipping.getText();
    }

    public ShoppingCartPage shouldRemoveProductFromBasket() {
        click(removeFromBasketButton);
        return this;
    }

    public String getTextFromEmptyCart() {
        wait.until(ExpectedConditions.visibilityOf(textFromEmptyCart));
        return textFromEmptyCart.getText();
    }
}
