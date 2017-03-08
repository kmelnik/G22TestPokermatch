package mainPack;

import org.junit.Test;
import org.openqa.selenium.By;
import parentTest.ParentTest;

/**
 * Created by k.melnyk on 01.03.2017.
 */
public class LoginTest extends ParentTest {
    public LoginTest(String browser) {
        super(browser);
    }

    @Test
    public void validLogOn() {
        loginPage.open("https://pokermatch.com/");
        loginPage.clickOnButtonLogin();
        loginPage.enterLogin("mobtest");
        loginPage.enterPass("lsd666");
        loginPage.clickOnButtonLoginSignIn();
        checkAC("Failed Expected Result", loginPage.actualResult(), true);
    }

}
