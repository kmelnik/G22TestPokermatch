package Pages;



import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import static org.hamcrest.Matchers.is;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParentPage {
    WebDriver driver;
    Logger logger;
    ActionsWithOurElements actionsWithOurElements;
    String url = "https://pokermatch.com/en";
    @FindBy (xpath = ".//*//a[@class='logo head__elem']")
    WebElement brandLogo;

    public ParentPage(WebDriver driver) {
        this.driver = driver;
        logger = Logger.getLogger(getClass());
        actionsWithOurElements = new ActionsWithOurElements(driver);
    }

    /**
     * Method for open page with url
     *
     * */

    public void open (String url) {
        try {
driver.get(url);
logger.info("Page was opened with url "+url);
    } catch (Exception e) {
            logger.error("Can't open "+url);
            Assert.fail("Can't open "+url);
        }

        }
        public void checkBrandLogo () {
        try {
           actionsWithOurElements.isElementPresent(brandLogo);
           logger.info("Brand Logo is present");
        } catch (Exception e) {
            logger.error("Can't find Brand Logo");
            Assert.fail("Can't find Brand Logo");
        }
        }

}
