package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.How.CSS;
import static org.openqa.selenium.support.How.XPATH;

public class InsightsPage {

    WebDriver driver;


//    locators

    @FindBy(how = How.XPATH, using = "//a[text()=' Go to blog ']")
    WebElement goToBlogButton;

    @FindBy(how = CSS, using = "[type='email']")
    WebElement emailToSubScribeInput;

    @FindBy(how = XPATH, using = "//button[@id='form-newsletter-insights-submit-btn']")
    WebElement SubscribeButton;

    @FindBy(how = CSS, using = ".form-custom-light.form-insights-newsletter > .mc4wp-response")
    WebElement subscribedMessage;


    public InsightsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void typeEmail(String email) {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(emailToSubScribeInput));
        emailToSubScribeInput.sendKeys(email);
    }

    public void submitSubscribe() {
        SubscribeButton.click();
    }

    public void subscribeNewsLetter(String email) {
        typeEmail(email);
        submitSubscribe();
    }

    public String subscribedSucessfully() {
       return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(subscribedMessage)).getText();
    }

    public boolean isPageOpened() {
        return driver.getCurrentUrl().contains("/insights") && emailToSubScribeInput.isEnabled();
    }


}
