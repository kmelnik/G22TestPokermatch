package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.hamcrest.Matchers.is;


public class ActionsWithOurElements {
    private WebDriver driver;
    private Logger logger;
    private WebDriverWait webDriverWait15;
    private WebDriverWait webDriverWait20;

    public ActionsWithOurElements(WebDriver driver) {
        this.driver = driver;
        logger = Logger.getLogger(getClass());
       webDriverWait15 = new WebDriverWait(driver, 15);
       webDriverWait20 = new WebDriverWait(driver, 20);
    }


    public void enterText(WebElement element, String text) {
       try {
           webDriverWait15.until(ExpectedConditions.visibilityOf(element));
          element.clear();
            element.sendKeys(text);
           logger.info(text + " was inputed");

        } catch (Exception e) {
          logger.error("Can not work with input");
          Assert.fail("Can not work with input");
      }
    }
    public void enterText(String xpathLocator, String text) {
        try {
            driver.findElement(By.xpath(xpathLocator)).clear();
            driver.findElement(By.xpath(xpathLocator)).sendKeys(text);
            logger.info(text + " was inputed");

        } catch (Exception e) {
            logger.error("Can not work with input");
            Assert.fail("Can not work with input");
        }
    }
    public boolean isElementPresent(WebElement element) {
        try {
            return element.isDisplayed() && element.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }
    public void clickOnElement(WebElement element) {
        try {
            webDriverWait20.until(ExpectedConditions.elementToBeClickable(element));
            webDriverWait20.until(ExpectedConditions.not(ExpectedConditions.invisibilityOf(element)));
            element.click();
            logger.info("Element was clicked");

        } catch (Exception e) {
            logger.error("Can not work with button");
            Assert.fail("Can not work with button");
        }
    }
    public void clickOnElement(String xpathLocator) {
        try {

           // webDriverWait15.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathLocator)));
            //webDriverWait20.until(ExpectedConditions.not(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpathLocator))));
            Thread.sleep(2000);
            driver.findElement(By.xpath(xpathLocator)).click();
            logger.info("Element was clicked");

        } catch (Exception e) {
            logger.error("Can not work with button" + e);
            Assert.fail("Can not work with button");
        }
    }


    public boolean isElementPresent(String xpathLocator) {
        try {
            WebElement webElement = driver.findElement(By.xpath(xpathLocator));
            return webElement.isDisplayed() && webElement.isEnabled();
        } catch (Exception e) {
            return false;
        }
    }


    public void checkTextInElement(String locator, String expectedText) {
        try {
            String textFromElement = driver.findElement(By.xpath(locator)).getText();
            Assert.assertThat("Text in element not match", textFromElement, is(expectedText));
        } catch (Exception e) {
            logger.error("Cannot found element");
            Assert.fail("Cannot found element");
        }
    }
    public String getTextFromElement(String xpathLocator) {
        String textFromElement = "";
        try {
            textFromElement = webDriverWait15.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator))).getText();
        } catch (Exception e) {
            logger.error("Can not work with element");
            Assert.fail("Can not work with element");
        }
        return textFromElement;
    }
    public void workWithIframeCash (String xpathLocator) {
        try {
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
            driver.findElement(By.xpath(xpathLocator)).click();
            logger.info("Iframe was found");

        } catch (Exception e) {
            logger.error("Can not work with iframe elements");
            Assert.fail("Can not work with iframe elements");
        }
    }
}

