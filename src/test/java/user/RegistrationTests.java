package user;

import base.Pages;
import helpers.RandomHelper;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;


public class RegistrationTests extends Pages {


    @Test
    public void shouldRegisterNewUser() {
        topMenuPage.shouldClickSignInButton();


        loginPage.shouldClickNoAccountButton();


        registrationPage
                .selectMaleGender()
                .setFirstName("Jan")
                .setLastName("Kowalski")
                .setEmail(RandomHelper.getRandomEmail())
                .setPassword("1234567")
                .shouldClickTwoPrivacyCheckbox()
                .shouldClickSaveButton();

        Assertions.assertThat(topMenuPage.getLoggedInUserName()).isEqualTo("Jan Kowalski");

    }

    //======================================================================================================================
    //Zadanie 2
    @Test
    public void shouldSearchRandomProductFromMainPage() {
        String productName = mainPage.getRandomProductNameFromMainPage();

        topMenuPage
                .setProductNameInSearchWidget(productName)
                .shouldClickSearchIcon();

        Assertions.assertThat(searchResultsPage.getSearchedProductName()).isEqualTo(productName);
    }

    //======================================================================================================================
    //Zadanie 3
    @Test
    public void shouldAddAndDeleteThreeHummingBirdTShirt() {
//        mainPage.shouldClickInProductHummingBirdTShirt();
        mainPage.openProductWithName("HUMMINGBIRD T-SHIRT");
        productPage
                .setQuantityField("3")
                .shouldClickSubmitButton();

        popUpElements.shouldClickProceedToCheckoutButton();

        Assertions.assertThat(shoppingCartPage.getProductNameFromShoppingCart()).isEqualTo("HUMMINGBIRD T-SHIRT");
        Assertions.assertThat(shoppingCartPage.getQuantityOfProduct()).isEqualTo("3");
        Assertions.assertThat(shoppingCartPage.getPriceOfOneProduct()).isEqualTo("$19.12");
        Assertions.assertThat(shoppingCartPage.getTotalPriceWithoutSipping()).isEqualTo("$57.36");

        shoppingCartPage.shouldRemoveProductFromBasket();
        Assertions.assertThat(shoppingCartPage.getTextFromEmptyCart()).isEqualTo("There are no more items in your cart");

    }

}
