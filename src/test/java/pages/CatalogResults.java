package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CatalogResults {
    private final SelenideElement discountElement = $x("//span[contains(text(),'2-комн. квартира, 36,5 м², 4/5 эт.')]//ancestor::div[1]/following-sibling::div//*[contains(@class, 'block_discountText')]");

    public String getDiscountsFromCatalogResults(){
        return discountElement.getText();
    }
}
