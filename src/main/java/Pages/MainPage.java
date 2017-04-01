package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends ParentPage {

    @FindBy(xpath = ".//*//a[@href='#login']")
    WebElement buttonLogin;

    public MainPage (WebDriver driver) {
        super(driver);
    }
   public void openMainPage(){
        open(url);
    }

    public void clickButtonLogin() {
        actionsWithOurElements.clickOnElement(".//*//a[@href='#login']");
    }
}
