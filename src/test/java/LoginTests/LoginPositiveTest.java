package LoginTests;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginPositiveTest extends ParentTest {
    public LoginPositiveTest(String browser) {
        super(browser);
    }

    @Test
    public void validLogOn() {
        mainPage.openMainPage();
        mainPage.checkBrandLogo();
        mainPage.clickButtonLogin();
        loginPage.checkAuthFormTitle();
        loginPage.loginUser("mobtest","lsd666");

        checkAC("Failed Expected Result", authorizedMainPage.isUserPinCodePresent(), true);
    }

}
