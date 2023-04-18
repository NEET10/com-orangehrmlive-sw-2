package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setup() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.name("username")).sendKeys("Admin"); //Enter username
        driver.findElement(By.name("password")).sendKeys("admin123"); //Enter password
        driver.findElement(By.xpath("//button[@type = 'submit']")).click(); //click on login button
        //Verify the 'Dashboard' test is display

        String expectedMessage = "Dashboard";
        //Xpath for 'Dashboard'
        WebElement actualTextElements = driver.findElement(By.xpath("//h6[text() ='Dashboard']"));

        String actualMessage = actualTextElements.getText();
        //comparing actualMessage with expectedMessage
        Assert.assertEquals( expectedMessage, actualMessage);
    }
    @After
    public void testDown() {
        closeBrowser();
    }

}
