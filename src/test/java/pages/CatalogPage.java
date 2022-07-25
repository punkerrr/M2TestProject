package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage {
    private final SelenideElement discountElement = $x("//div[contains(@class, 'block_discountText')]");
    private final SelenideElement checkBoxDiscount = $x("//div[text()='Только с дисконтом']/parent::*");

    public void openCatalog ( String url){
        Selenide.open(url);
    }

    public String getDiscountsFromCatalog(){
        return discountElement.getText();
    }

    public void setDiscountCheckBoxActive(){
        checkBoxDiscount.click();

    }

}
