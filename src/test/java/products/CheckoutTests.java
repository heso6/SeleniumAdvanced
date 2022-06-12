package products;

import base.Pages;
import helpers.RandomHelper;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.user.RegistrationPage;

public class CheckoutTests extends Pages {

    String alaskaState = "5";
    String orderNumber;

    String name = "Jan";
    String lastname = "Kowalski";
    String street = "Konstruktorska";
    String city = "Anchorage";
    String zipCode = "12345";

    @Test
    public void shouldBuyProduct() {
        mainPage.openProductWithName("HUMMINGBIRD T-SHIRT");
        productPage.shouldClickSubmitButton();
        popUpElements.shouldClickProceedToCheckoutButton();
        shoppingCartPage.shouldClickProceedToCheckoutButton();

        new RegistrationPage(driver).selectMaleGender()
                .setFirstName(name)

                .setLastName(lastname)
                .setEmail(RandomHelper.getRandomEmail())
                .setPassword("1234567")
                .shouldClickTwoPrivacyCheckbox();

        personalInfoCheckoutPage.shouldClickContinueButton();

        addressCheckoutPage
                .setAddress(street)
                .setCity(city)
                .selectUtahState(alaskaState)
                .setZipCode(zipCode)
                .clickContinueButton();

        shippingCheckoutPage.clickContinueButton();

        paymentCheckoutPage
                .clickPayByCheckCheckBox()
                .clickTermsAndConditionsCheckBox()
                .clickPlaceOrderButton();

        Assertions.assertThat(orderDetailsPage.getConfirmedOrderTxt()).contains("YOUR ORDER IS CONFIRMED");
        Assertions.assertThat(orderDetailsPage.getProductName()).contains("HUMMINGBIRD T-SHIRT");
        Assertions.assertThat(orderDetailsPage.getProductPrice()).isEqualTo("$19.12");
        Assertions.assertThat(orderDetailsPage.getQuantityOfProduct()).isEqualTo("1");
        Assertions.assertThat(orderDetailsPage.getProductTotalPrice()).isEqualTo("$26.12");

        orderNumber = orderDetailsPage.getOrderReference();
        orderDetailsPage.goToAccountPage();
        myAccountPage.goToOrderHistoryAndDetails();
        Assertions.assertThat(historyOfOrdersPage.getOrderReference()).isEqualTo(orderNumber);
        historyOfOrdersPage.getOrderDetails();

        Assertions.assertThat(historyOfOrdersPage.getOrderReferenceOnOrderDetailsPage()).contains(orderNumber);


        Assertions.assertThat(orderDetailsPage.getDeliveryData()).contains(name + " " + lastname);
        Assertions.assertThat(orderDetailsPage.getDeliveryData()).contains(street);


    }
}
