import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.CatalogPage;

public class CatalogTest extends BaseTest {

    private final static String BASE_URL="https://v-lot.ru/catalog";
    private final static String DICOUNT="-15%";

    @Test
    public void testCheckDiscount(){
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.openCatalog(BASE_URL);
        catalogPage.setDiscountCheckBoxActive();
        Assertions.assertEquals(catalogPage.getDiscountsFromCatalog(),DICOUNT);


    }


}