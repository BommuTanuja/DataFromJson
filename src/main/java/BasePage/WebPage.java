package BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class WebPage {
    public WebDriver driver;
    JavascriptExecutor jse;

    @BeforeSuite
    public void initializingPage(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        jse = (JavascriptExecutor) driver;
    }

    @BeforeTest
    public void launchingApplication(){
       // driver.get("https://www.saucedemo.com/");
       // driver.get("https://www.snapdeal.com/");
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

//    @AfterTest
//    public void closeSession(){
//        driver.quit();
//    }
}
