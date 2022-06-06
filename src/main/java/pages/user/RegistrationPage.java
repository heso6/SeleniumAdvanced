package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.commons.TopMenuPage;

import java.util.List;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name='id_gender']")
    private List<WebElement> genders;

    @FindBy(css = "[name='firstname']")
    private WebElement firstName;

    @FindBy(css = "[name='lastname']")
    private WebElement lastName;

    @FindBy(css = ".form-control[name='email']")
    private WebElement email;

    @FindBy(css = "[name='password']")
    private WebElement password;

    @FindBy(css = "[name='customer_privacy']")
    private WebElement customerPrivacyCheckbox;

    @FindBy(css = "[name='psgdpr']")
    private WebElement psgdprCheckbox;

    @FindBy(css = "[data-link-action='save-customer']")
    private WebElement saveButton;


    public RegistrationPage selectMaleGender() {
        genders.get(0).click();
        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        sendKeys(this.firstName, firstName);
        return this;
    }

    public RegistrationPage setLastName(String lastName) {
        sendKeys(this.lastName, lastName);
        return this;
    }

    public RegistrationPage setEmail(String email) {
        sendKeys(this.email, email);
        return this;
    }

    public RegistrationPage setPassword(String password) {
        sendKeys(this.password, password);
        return this;
    }

    public RegistrationPage shouldClickTwoPrivacyCheckbox() {
        System.out.println("Accepting all required policies");
        customerPrivacyCheckbox.click();
        psgdprCheckbox.click();
        return this;
    }

    public TopMenuPage shouldClickSaveButton() {
        click(saveButton);
        return new TopMenuPage(driver);

    }


}
