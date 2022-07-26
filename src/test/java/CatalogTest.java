
import org.junit.jupiter.api.*;
import pages.CatalogPage;
import pages.NewCatalogPage;


public class CatalogTest extends BaseTest{



    private final static String BASE_URL="https://v-lot.ru/catalog";
    private final static String DICOUNT="-29%";





    /** Допустим что в Адыгея есть стабильный лот с названием "2-комн. квартира, 36,5 м², 4/5 эт." у которого есть стабильное значение дисканута.
     * Надеюсь, что оно не поменяется, потому что без сеттеинга данных нужных данных их соотвествие сложно гарантировать
    */
    @Test
    @DisplayName("Проверка дискаунта")
    public void testCheckDiscount(){
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.openCatalog(BASE_URL);
        catalogPage.setRegion("Адыгея");
        catalogPage.findArticulesWithDiscount();
        Assertions.assertEquals(catalogPage.getDiscountsFromCatalog(),DICOUNT);


    }

    /** В целом понял что за паттерн, но были проблемы с библиотекой arquillian и собственном инициалиазацией эксземпляров классов, которые отвечают за фрагменты страниц,
     * пришлось вызыывать конструкторы через new. По-другому вылетало NPE и я не разобрался почему. Зато вроде работает.
     */

    @Test
    @DisplayName("Проверка дискаунта через пейдж фрагментс")
    public void testCheckDiscountPageFragments()   {
        NewCatalogPage cp = new NewCatalogPage();
        cp.openCatalog(BASE_URL);
        cp.getCatalogSearchBar().setRegion("Адыгея");
        cp.getCatalogSearchBar().findArticulesWithDiscount();
        Assertions.assertEquals(cp.getCatalogResults().getDiscountsFromCatalogResults(),DICOUNT);


    }





}
