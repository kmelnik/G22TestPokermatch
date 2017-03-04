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
    public void validLogOn (){
        driver.get("https://pokermatch.com/");
        driver.findElement(By.xpath(".//a[@href='#login']")).click(); // find button Login
        //driver.findElement(By.xpath(".//*[@id='login']//*//h4[text()='Authorization']")).isDisplayed();
        driver.findElement(By.xpath(".//*[@id='login']//input[@name='login']")).sendKeys("mobtest");
        driver.findElement(By.xpath(".//*[@id='login']//input[@name='password' and @type='text']")).sendKeys("lsd666");
        driver.findElement(By.xpath(".//*[@id='login']//*//button[@type='button']")).click();
        checkAC("Element 'Ваш логин: ' found", driver.findElement(By.xpath(".//span[@class='info-list__item-label']")).isDisplayed(), true);
    }
}
