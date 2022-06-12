package products;

import base.Pages;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class CategoryTest extends Pages {


    @Test
    public void shouldVerifyCategories() {
        categoryPage.shouldCheckAllCategoriesByForLoop();
    }


    @Test
    public void shouldVerifyCategoriesSimpleWay() {

        topMenuPage.clickClothesCategory();
        Assertions.assertThat(categoryPage.getCategoryName()).isEqualTo("CLOTHES");
        Assertions.assertThat(String.valueOf(categoryPage.checkNumberElementsOnPage())).isEqualTo(categoryPage.getNumberOfProductsOnPage());

        topMenuPage.clickAccessoriesCategory();
        Assertions.assertThat(categoryPage.getCategoryName()).isEqualTo("ACCESSORIES");
        Assertions.assertThat(String.valueOf(categoryPage.checkNumberElementsOnPage())).isEqualTo(categoryPage.getNumberOfProductsOnPage());


        topMenuPage.clickArtCategory();
        Assertions.assertThat(categoryPage.getCategoryName()).isEqualTo("ART");
        Assertions.assertThat(String.valueOf(categoryPage.checkNumberElementsOnPage())).isEqualTo(categoryPage.getNumberOfProductsOnPage());
    }






}
