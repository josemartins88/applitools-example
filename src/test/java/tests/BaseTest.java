package tests;

import com.applitools.eyes.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected Eyes eyes;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        driver = new FirefoxDriver();
        eyes = new Eyes();
        eyes.setApiKey("87S2dl8bSUIOJwpdVLXjx9oltsokBHZTYnu1026qYVtA8110");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        eyes.abortIfNotClosed();
        driver.close();
    }

}
