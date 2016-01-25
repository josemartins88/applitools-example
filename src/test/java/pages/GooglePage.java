package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {

    @FindBy(id = "lst-ib")
    private WebElement inputBox;

    @FindBy(css = "button.lsb")
    private WebElement searchButton;

    @FindBy(css = "input[name='btnI']")
    private WebElement feelingLuckyButton;

    public void search(String searchTerm) {
        inputBox.sendKeys(searchTerm);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickFeelingLuckyButton() {
        feelingLuckyButton.click();
    }
}
