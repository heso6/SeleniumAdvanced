package pages.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;

import java.util.List;

public class CategoryPage extends BasePage {
    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[class='dropdown-item']")
    private List<WebElement> categoriesElement;

    @FindBy(css = "[class='thumbnail-container reviews-loaded']")
    private List<WebElement> allElementsInCategory;

    @FindBy(css = ".h1")
    private WebElement categoryName;

    @FindBy(css = "[class='col-md-6 hidden-sm-down total-products']")
    private WebElement numberOfProductsOnPage;


    public void shouldCheckAllCategoriesByForLoop() {
        for (int i = 0; i < categoriesElement.size(); i++) {
            System.out.println(categoriesElement.get(i).getText());
        }
    }

    public String getCategoryName() {
        return categoryName.getText();
    }

    public String getNumberOfProductsOnPage() {
        return numberOfProductsOnPage.getText().replace("There are ", "").replace(" products.", "");
    }

    public int checkNumberElementsOnPage() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("[class='thumbnail-container reviews-loaded']"), Integer.valueOf(getNumberOfProductsOnPage())));

        int counter = 0;
        for (WebElement element : allElementsInCategory) {
            counter++;
        }
        return counter;
    }

}
