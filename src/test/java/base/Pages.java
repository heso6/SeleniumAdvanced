package base;

import org.testng.annotations.BeforeMethod;
import pages.checkout.*;
import pages.commons.CategoryPage;
import pages.commons.TopMenuPage;
import pages.main.MainPage;
import pages.popUp.PopUpElements;
import pages.product.ProductPage;
import pages.searchResults.SearchResultsPage;
import pages.shoppingCart.ShoppingCartPage;
import pages.user.*;

public class Pages extends TestBase {

    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public TopMenuPage topMenuPage;
    public MainPage mainPage;
    public SearchResultsPage searchResultsPage;
    public ProductPage productPage;
    public ShoppingCartPage shoppingCartPage;
    public PopUpElements popUpElements;
    public PersonalInfoCheckoutPage personalInfoCheckoutPage;
    public AddressCheckoutPage addressCheckoutPage;
    public CheckoutConfirmationPage checkoutConfirmationPage;
    public ShippingCheckoutPage shippingCheckoutPage;
    public PaymentCheckoutPage paymentCheckoutPage;
    public OrderDetailsPage orderDetailsPage;
    public MyAccountPage myAccountPage;
    public HistoryOfOrdersPage historyOfOrdersPage;
    public CategoryPage categoryPage;


    @BeforeMethod
    public void pagesSetup() {
        mainPage = new MainPage(driver);
        popUpElements = new PopUpElements(driver);
        searchResultsPage = new SearchResultsPage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        topMenuPage = new TopMenuPage(driver);
        productPage = new ProductPage(driver);
        shoppingCartPage = new ShoppingCartPage(driver);
        personalInfoCheckoutPage = new PersonalInfoCheckoutPage(driver);
        addressCheckoutPage = new AddressCheckoutPage(driver);
        checkoutConfirmationPage = new CheckoutConfirmationPage(driver);
        shippingCheckoutPage = new ShippingCheckoutPage(driver);
        paymentCheckoutPage = new PaymentCheckoutPage(driver);
        orderDetailsPage = new OrderDetailsPage(driver);
        myAccountPage = new MyAccountPage(driver);
        historyOfOrdersPage = new HistoryOfOrdersPage(driver);
        categoryPage = new CategoryPage(driver);
    }
}

