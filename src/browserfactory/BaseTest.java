package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public static String baseUrl = "";
    public void openBrowser(String baseUrl){
        driver = new ChromeDriver();
        //Launch URL
        driver.get(baseUrl);
        //Maximize window
        driver.manage().window().maximize();
        //Implicit timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void closeBrowser(){
        driver.quit();  //close every instance
    }
}
