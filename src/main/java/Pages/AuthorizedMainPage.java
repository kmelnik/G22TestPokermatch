package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizedMainPage extends ParentPage {
    @FindBy(xpath = ".//article/div/div[2]/div[3]/div[2]/span[1]")
    WebElement userPinCode;
    @FindBy(xpath = "html/body/div[3]/section/article/div/div[2]/a[1]/span")
    WebElement balanceField;

    public AuthorizedMainPage (WebDriver driver) {
        super(driver);
    }

    public Boolean isUserPinCodePresent() {
        return actionsWithOurElements.isElementPresent(".//article/div/div[2]/div[3]/div[2]/span[1]");
    }

    public Boolean checkBalanceField() {
        return actionsWithOurElements.isElementPresent(balanceField);
    }

    public void clickBalanceField() {
        actionsWithOurElements.clickOnElement(".//*[@id='balance']");
    }
}
