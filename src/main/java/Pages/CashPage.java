package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CashPage extends ParentPage {
    @FindBy(xpath = ".//*[@id='with-js']/body/div[1]/ul/li[3]")
    WebElement buttonTransactionHistory;
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



    public Boolean checkTransactionHistoryButton() {
        return actionsWithOurElements.isElementPresent(buttonTransactionHistory);
    }

    public void clickTransactionHistoryButton() {
        actionsWithOurElements.clickOnElement(".//*[contains(text(),'Transaction history')]");
    }


    public Boolean isTransactionHistoryItemsPresent() {
        return
                actionsWithOurElements.isElementPresent(orderNumberTransaction) &&
                        actionsWithOurElements.isElementPresent(dateItem) &&
                        actionsWithOurElements.isElementPresent(ammountItem) &&
                        actionsWithOurElements.isElementPresent(typeTransactionItem) &&
                        actionsWithOurElements.isElementPresent(walletItem);

    }

}
