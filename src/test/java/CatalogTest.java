import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CatalogPage;

public class CatalogTest extends BaseTest {

    private final static String BASE_URL="https://v-lot.ru/catalog";
    private final static String DICOUNT="-29%";

    /** Допустим что в Адыгея есть стабильный лот с названием "2-комн. квартира, 36,5 м², 4/5 эт." у которого есть стабильное значение дисканута.
     * Надеюсь, что оно не поменяется, потому что без сеттеинга данных нужных данных их соотвествие сложно гарантировать
    */
    @Test
    @Step("Проверка дискаунта")
    @DisplayName("Проверка дискаунта")
    public void testCheckDiscount(){
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.openCatalog(BASE_URL);
        catalogPage.setRegion("Адыгея");
        catalogPage.findArticulesWithDiscount();
        Assertions.assertEquals(catalogPage.getDiscountsFromCatalog(),DICOUNT);


    }


}
