package Pages;


import org.openqa.selenium.WebDriver;

public class LoginPage extends ParentPage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    /*public void enterLogin (String login) {
        try {
            driver.findElement(By.name("_username")).clear();
            driver.findElement(By.name("_username")).sendKeys(login);
            logger.info(login + " was entered in input");
        } catch (Exception e) {
            logger.error("Cannot work with input login");
            Assert.fail("Cannot work with input login");
        }
    }*/
    public void clickOnButtonLogin () {
        actionsWithOurElements.clickOnButtonLogin (".//a[@href='#login']");
    }
    public void enterLogin (String login) { actionsWithOurElements.enterText(".//*[@id='login']//input[@name='login']", login);
    }
    public void enterPass (String pass) {
        actionsWithOurElements.enterText(".//*[@id='login']//input[@name='password' and @type='text']", pass);
    }
    public void clickOnButtonLoginSignIn () {
        actionsWithOurElements.clickOnButtonLogin (".//*[@id='login']//form/div[4]/button");
    }


    public Boolean actualResult () {
       actionsWithOurElements.actualResult(".//*[@class='info-list__item info-list__item_type_nickpin']");
        return true;
    }
    public Boolean actualResultNegativeTest () {
        actionsWithOurElements.actualResult(".//*[@id='login']//*[@class='modala__error' and @style='display: block;']");
        return true;
    }
}


