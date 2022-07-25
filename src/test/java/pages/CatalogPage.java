package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage {
    private final SelenideElement discountElement = $x("//span[contains(text(),'2-комн. квартира, 36,5 м², 4/5 эт.')]//ancestor::div[1]/following-sibling::div//*[contains(@class, 'block_discountText')]");
    private final SelenideElement checkBoxDiscount = $x("//div[text()='Только с дисконтом']/parent::*");
    private final SelenideElement buttonFind = $x("//span[text()='Найти']/parent::*");
    private final SelenideElement regionsDropdown = $x("//div[text()='Регион']/parent::*");
    private final SelenideElement regionsInput = $x("//input[contains(@class, 'input_no-autofill')]");
    private final SelenideElement regionsResultFirstRow = $x("//div[contains(@class,'multiselect')]");

    public void openCatalog ( String url){
        Selenide.open(url);
    }

    public String getDiscountsFromCatalog(){
        return discountElement.getText();
    }

    public void findArticulesWithDiscount(){
        checkBoxDiscount.click();
        buttonFind.click();
    }

    public void setRegion( String region){
        regionsDropdown.click();
        regionsInput.sendKeys(region);
        regionsResultFirstRow.click();
        regionsInput.sendKeys(Keys.ESCAPE);

    }

}
