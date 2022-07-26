package pages;

import com.codeborne.selenide.Selenide;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NewCatalogPage {

    @Drone
    private WebDriver driver;

    @FindBy(id="csb")
    private CatalogSearchBar searchBar = new CatalogSearchBar();

    @FindBy(id="cr")
    private CatalogResults catalogResults = new CatalogResults();

    public NewCatalogPage() {
    }

    public void openCatalog ( String url){
        Selenide.open(url);
    }

    public CatalogResults getCatalogResults(){
        return catalogResults;
    }

    public CatalogSearchBar getCatalogSearchBar(){
        return searchBar;
    }
}
