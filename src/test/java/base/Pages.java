package base;

import org.testng.annotations.BeforeMethod;
import pages.commons.TopMenuPage;
import pages.main.MainPage;
import pages.popUp.PopUpElements;
import pages.product.ProductPage;
import pages.searchResults.SearchResultsPage;
import pages.shoppingCart.ShoppingCartPage;
import pages.user.LoginPage;
import pages.user.RegistrationPage;

public class Pages extends TestBase {

    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public TopMenuPage topMenuPage;
    public MainPage mainPage;
    public SearchResultsPage searchResultsPage;
    public ProductPage productPage;

    public ShoppingCartPage shoppingCartPage;

    public PopUpElements popUpElements;

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
    }
}

