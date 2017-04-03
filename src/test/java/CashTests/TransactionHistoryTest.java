package CashTests;


import org.junit.Test;
import parentTest.ParentTest;

public class TransactionHistoryTest extends ParentTest {
    public TransactionHistoryTest(String browser) {
        super(browser);
    }

    @Test
    public void transactionHistoryTest() {
        mainPage.openMainPage();
        mainPage.checkBrandLogo();
        mainPage.clickButtonLogin();
        loginPage.checkAuthFormTitle();
        loginPage.loginUser("mobtest", "lsd666");
        authorizedMainPage.checkBalanceField();
        authorizedMainPage.clickBalanceField();
        cashPage.checkTransactionHistoryButton();
        cashPage.clickTransactionHistoryButton();
        checkAC("No such elements in Transaction History Page", cashPage.isTransactionHistoryItemsPresent(), true);

    }

}
