package LoginTests;


import org.junit.Test;
import parentTest.ParentTest;


public class LoginNegativeTests extends ParentTest {
    public LoginNegativeTests(String browser) {
        super(browser);
    }

    @Test
    public void loginFailedTestWithBadLogin() {
        mainPage.openMainPage();
        mainPage.checkBrandLogo();
        mainPage.clickButtonLogin();
        loginPage.checkAuthFormTitle();
        loginPage.loginUser("dsds","lsd666");

        checkAC("Failed Expected Result", loginPage.isErrorMessagePresent(), true);

    }

}
