package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //Find and click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[text() = 'Forgot your password? ']")).click();
        String expectedMessage = "Reset Password";
        WebElement actualTextElements = driver.findElement(By.xpath("//h6[text() = 'Reset Password']"));
        String actualMessage = actualTextElements.getText();
        Assert.assertEquals( expectedMessage, actualMessage);
    }
    @After
    public void testDown() {
        closeBrowser();
    }
}

