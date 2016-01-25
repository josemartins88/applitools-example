package tests;

import com.applitools.eyes.RectangleSize;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.GooglePage;

public class GoogleTest extends BaseTest {

    @Test
    public void testSearch() {
        driver = eyes.open(driver, "Google", "Test search", new RectangleSize(1024, 768));

        driver.get("http://google.co.uk");

        eyes.checkWindow("Google Main Page");

        GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);
        googlePage.search("Something");
        googlePage.clickSearchButton();

        eyes.checkWindow("Google Search Results Page");
        eyes.close();
    }

    @Test
    public void testFeelingLucky() {
        driver = eyes.open(driver, "Google", "Test feeling lucky", new RectangleSize(1024, 768));

        driver.get("http://google.co.uk");

        GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);
        googlePage.clickFeelingLuckyButton();

        eyes.checkWindow("Google Feeling Lucky Page");
        eyes.close();
    }

}
