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
        driver.get("https://pokermatch.com/");
        driver.findElement(By.xpath(".//a[@href='#login']")).click(); // find button Login
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys("mobtest");
        driver.findElement(By.xpath(".//*[@id='login']//input[@name='password' and @type='text']")).clear();
        driver.findElement(By.xpath(".//*[@id='login']//input[@name='password' and @type='text']")).sendKeys("lsd666");
        driver.findElement(By.xpath(".//*[@id='login']//form/div[4]/button")).click();
        checkAC("Failed Expected Result", driver.findElement(By.xpath(".//*[@class='info-list__item info-list__item_type_nickpin']")).isDisplayed(), true);
    }

}
