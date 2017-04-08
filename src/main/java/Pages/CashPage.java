package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.FindBy;

public class CashPage extends ParentPage {

    @FindBy(xpath = ".//*[@class='order_number']")
    WebElement orderNumberTransaction;
    @FindBy(xpath = ".//*[@class='date']")
    WebElement dateItem;
    @FindBy(xpath = ".//*[@class='amount']")
    WebElement ammountItem;
    @FindBy(xpath = ".//*[@class='type']")
    WebElement typeTransactionItem;
    @FindBy(xpath = ".//*[@class='payment_info']")
    WebElement walletItem;

    public CashPage (WebDriver driver) {
        super(driver);
    }


    public void openTransactionHistoryPage() {

        actionsWithOurElements.workWithIframeCash(".//*[@id='with-js']/body/div[1]/ul/li[3]");

    }

    public Boolean isTransactionHistoryItemsPresent() {
        return
                actionsWithOurElements.isElementPresent(".//*[@class='order_number']") &&
                        actionsWithOurElements.isElementPresent(".//*[@class='date']") &&
                        actionsWithOurElements.isElementPresent(".//*[@class='amount']") &&
                        actionsWithOurElements.isElementPresent(".//*[@class='type']") &&
                        actionsWithOurElements.isElementPresent(".//*[@class='payment_info']");

    }

}
