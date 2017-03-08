package mainPack;


import org.junit.Test;
import org.openqa.selenium.By;
import parentTest.ParentTest;


/**
 * Created by k.melnyk on 05.03.2017.
 */
public class LoginFailedTest extends ParentTest {
    public LoginFailedTest(String browser) {
        super(browser);
    }
    @Test
    public void loginFailedTest() {
        loginPage.open("https://pokermatch.com/");
        loginPage.clickOnButtonLogin();
        loginPage.enterLogin("dsds");
        loginPage.enterPass("lsd666");
        loginPage.clickOnButtonLoginSignIn();
        checkAC("Failed Expected Result", loginPage.actualResultNegativeTest(), true);

    }

}
