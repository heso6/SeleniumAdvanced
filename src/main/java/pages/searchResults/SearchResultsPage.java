package pages.searchResults;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class SearchResultsPage extends BasePage {
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".h3.product-title a")
    private WebElement productName;


    public String getSearchedProductName() {
        return productName.getText();
    }
}
