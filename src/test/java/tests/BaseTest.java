package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    private final String PATH_DRIVER = "src/test/resources/drivers/";


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", PATH_DRIVER + "chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);

        // To maximize browser
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(
                10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }

}
