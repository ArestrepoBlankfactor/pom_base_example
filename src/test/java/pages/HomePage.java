package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

public class HomePage {
    private WebDriver driver;

    //locators
    @FindBy(how = XPATH, using = "//li[@id='menu-item-4436']//span[contains(text(),'Insights')]")
    WebElement insightsSecctionTab;

    @FindBy(how = ID, using = "hs-eu-confirmation-button")
    WebElement acceptAlertCookiesButton;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void goToInsigthsSecction() {

        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(acceptAlertCookiesButton)).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(insightsSecctionTab));
        insightsSecctionTab.click();
    }
}
