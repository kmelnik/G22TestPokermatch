package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage {

    @FindBy(xpath = ".//*[@id='login']//*//h4[text()='Authorization']")
    WebElement authFormTitle;

    @FindBy(xpath = ".//*[@id='login']//input[@name='login']")
    WebElement loginInput;

    @FindBy(xpath = ".//*[@id='login']//input[@name='password' and @type='text']")
    WebElement passInput;

    @FindBy(xpath = ".//*[@id='login']//form/div[4]/button")
    WebElement buttonSignIn;

    @FindBy(xpath = ".//*[@id='login']//*[@class='modala__error' and @style='display: block;']")
    WebElement loginErrorMessage;
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void checkAuthFormTitle () {
        actionsWithOurElements.isElementPresent(authFormTitle);
    }
    public void enterLogin(String login) {
        try {
            loginInput.clear();
            loginInput.sendKeys(login);
            logger.info(login + " was entered in input ");
        } catch (Exception e) {
            logger.error("Cannot work with input login");
            Assert.fail("Cannot work with input login");
        }
    }

    public void enterPass(String pass) {

        actionsWithOurElements.enterText(passInput, pass);
    }

    private void clickButtonSighIn() {
        actionsWithOurElements.clickOnElement(buttonSignIn);
    }
    public void loginUser(String login, String pass){
        enterLogin(login);
        enterPass(pass);
        clickButtonSighIn();

    }


    public Boolean isErrorMessagePresent() {
        return actionsWithOurElements.isElementPresent(loginErrorMessage);
    }
}


