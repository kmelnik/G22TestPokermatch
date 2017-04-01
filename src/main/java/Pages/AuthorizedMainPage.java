package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizedMainPage extends ParentPage {
    @FindBy(xpath = ".//*[@class='info-list__item info-list__item_type_nickpin")
    WebElement UserPinCode;
    public AuthorizedMainPage (WebDriver driver) {
        super(driver);
    }

    public Boolean isUserPinCodePresent() {
        return actionsWithOurElements.isElementPresent(UserPinCode);
    }
}
