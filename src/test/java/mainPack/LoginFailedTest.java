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
        driver.get("https://pokermatch.com/");
        driver.findElement(By.xpath(".//a[@href='#login']")).click(); // find button Login
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys("dsds"); // unvalid login
        driver.findElement(By.xpath(".//*[@id='login']//input[@name='password' and @type='text']")).clear();
        driver.findElement(By.xpath(".//*[@id='login']//input[@name='password' and @type='text']")).sendKeys("lsd666");
        driver.findElement(By.xpath(".//*[@id='login']//form/div[4]/button")).click();
        checkAC("Failed Expected Result", driver.findElement(By.xpath(".//*[@id='login']//*[@class='modala__error' and @style='display: block;']")).isDisplayed(), true);
    }

}
