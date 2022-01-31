package tests;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.InsightsPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchInsightsTest extends BaseTest {

    private final String URL = "https://blankfactor.com/";

    @Test
    public void gotoAInsightSection() {
        driver.get(URL);
        // create object of the page classes
        HomePage homePage = new HomePage(driver);
        InsightsPage insightsPage = new InsightsPage(driver);

        //move to the blankfactor insights section
        homePage.goToInsigthsSecction();
        //validate the page insights has been opened
        Assert.assertTrue(insightsPage.isPageOpened());
        // try to subscribe a user in newsletter
        insightsPage.subscribeNewsLetter("test12@gmail.com");
        //validation
        assertThat(insightsPage.subscribedSucessfully(), CoreMatchers.is("Thank you for subscribing! Stay tuned."));
    }

}