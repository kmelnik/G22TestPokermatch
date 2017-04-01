package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {

    @FindBy(xpath = ".//*[@id='login']//*//h4[text()='Authorization']")
    WebElement authFormTitle;

    @FindBy(xpath = ".//*[@id='login']/div/div/div[2]/form/div[1]/input")
    WebElement loginInput;

    @FindBy(name="password")
    WebElement passInput;

    @FindBy(xpath = ".//*[@id='login']//form/div[4]/button")
    WebElement buttonSignIn;

    @FindBy(xpath = ".//*[@id='login']//*[@class='modala__error' and @style='display: block;']")
    WebElement loginErrorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void checkAuthFormTitle() {
        actionsWithOurElements.isElementPresent(authFormTitle);
    }

    public void enterLogin(String login) {
        actionsWithOurElements.enterText(".//*[@id='login']//input[@name='login']", login);
    }

    public void enterPass(String pass) {

        actionsWithOurElements.enterText(".//*[@id='login']//input[@name='password' and @type='text']", pass);
    }

    private void clickButtonSighIn() {
        actionsWithOurElements.clickOnElement(".//*[@id='login']//form/div[4]/button");
    }

    public void loginUser(String login, String pass) {
        enterLogin(login);
        enterPass(pass);
        clickButtonSighIn();

    }

    public Boolean isErrorMessagePresent() {
        return actionsWithOurElements.isElementPresent(".//*[@id='login']//*[@class='modala__error' and @style='display: block;']");
    }
}


