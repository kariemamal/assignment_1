package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    public static WebDriver webDriver;
    WebDriverWait webDriverWait;


    @BeforeSuite
    public void startDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver(options);
        webDriver.get("https://www.facebook.com/");
        webDriver.manage().window().maximize();
    }


    public void assertIsEqual(WebElement actualElement , String expected){
        webDriverWait = new WebDriverWait(webDriver , 30);
        webDriverWait.until(ExpectedConditions.visibilityOf(actualElement));
        Assert.assertEquals(actualElement.getText(), expected);
    }


}
