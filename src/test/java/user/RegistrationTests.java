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

    @Test
    public void shouldSearchRandomProductFromMainPage() {
        String productName = mainPage.getRandomProductNameFromMainPage();

        topMenuPage
                .setProductNameInSearchWidget(productName)
                .shouldClickSearchIcon();

        Assertions.assertThat(searchResultsPage.getSearchedProductName()).isEqualTo(productName);
    }

    @Test
    public void shouldAddAndDeleteThreeHummingBirdTShirt() {
        mainPage.shouldClickInProductHummingBirdTShirt();
        productPage
                .setQuantityField("3")
                .shouldClickSubmitButton()
                .shouldClickProceedToCheckoutButton();
    }

}
