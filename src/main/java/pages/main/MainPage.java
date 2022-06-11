package pages.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

import java.util.List;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".h3.product-title a")
    private List<WebElement> productName;

    @FindBy(xpath = "//a[contains(text(),'HUMMINGBIRD T-SHIRT')]")
    private WebElement productHummingBirdTShirt;

    public String getRandomProductNameFromMainPage() {
        return getRandomEelement(productName).getText();
    }

//    public void shouldClickInProductHummingBirdTShirt() {
//        click(productHummingBirdTShirt);
//    }

//    ===========================================================================================

    public List<WebElement> getProducts(int expectedAmountOfProducts) {
        return wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector(".product-title"), expectedAmountOfProducts));
    }


    //    optymalna wersja shouldClickInProductHummingBirdTShirt
    public void openProductWithName(String productName) {
        for (WebElement element : getProducts(8)) {
            if (element.getText().equals(productName)) {
                element.click();
                return;
            }
        }


    }
}
