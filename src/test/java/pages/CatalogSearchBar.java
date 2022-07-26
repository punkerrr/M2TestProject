package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class CatalogSearchBar {
    private final SelenideElement checkBoxDiscount = $x("//div[text()='Только с дисконтом']/parent::*");
    private final SelenideElement buttonFind = $x("//span[text()='Найти']/parent::*");
    private final SelenideElement regionsDropdown = $x("//div[text()='Регион']/parent::*");
    private final SelenideElement regionsInput = $x("//input[contains(@class, 'input_no-autofill')]");
    private final SelenideElement regionsResultFirstRow = $x("//div[contains(@class,'multiselect')]");

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
