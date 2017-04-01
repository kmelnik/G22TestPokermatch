package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizedMainPage extends ParentPage {
    @FindBy(xpath = ".//article/div/div[2]/div[3]/div[2]/span[1]")
    WebElement UserPinCode;
    public AuthorizedMainPage (WebDriver driver) {
        super(driver);
    }

    public Boolean isUserPinCodePresent() {
        return actionsWithOurElements.isElementPresent(".//article/div/div[2]/div[3]/div[2]/span[1]");
    }
}
