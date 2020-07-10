import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSetupTest {

//    public static void main(String[] args) throws MalformedURLException {
//        setUpDriver();
//        cleanUp();
//    }

//    @FindBy(xpath = "//*[@id=\"app-navigation\"]/div[1]/div[1]/div/div[2]/div/div/div[2]/div")
    private IOSElement hamburgerMenuButton;

//    @FindBy(xpath = "//*[@id=\"app-navigation\"]/div[1]/div[1]/div/div[1]/div/a/svg")
    private IOSElement builtinLogo;

    IOSDriver<WebElement> driver;

    @BeforeEach
    public void setUpDriver() throws MalformedURLException {
      System.out.println("setUpDriver invoked");
      DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
      desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
      desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
      desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
      URL url = new URL("http://127.0.0.1:4723/wd/hub");
//        URL url = new URL("http://builtin.com");
//      AppiumDriver driver = new AppiumDriver(url, desiredCapabilities);
        driver = new IOSDriver<WebElement>(url, desiredCapabilities);

//        driver.get();
    }

    @Test
    public void navigateToBuiltIn() {
//        TouchActions action = new TouchActions(driver);
        TouchAction action = new TouchAction(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        if (driver.queryAppState("com.apple.mobilesafari").toString().equals("RUNNING_IN_FOREGROUND")){
            driver.get("http://builtin.com");
        }
//        action.singleTap(hamburgerMenuButton);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app-navigation\"]/div[1]/div[1]/div/div[2]/div/div/div[2]/div")));
        hamburgerMenuButton = (IOSElement) driver.findElement(By.xpath("//*[@id=\"app-navigation\"]/div[1]/div[1]/div/div[2]/div/div/div[2]/div"));
        action.tap(new TapOptions().withElement(new ElementOption().withElement(hamburgerMenuButton))).perform();

    }

    @AfterEach
    public void cleanUp() {
        System.out.println("cleanUp invoked");
//        driver.close();
        driver.quit();
    }
}
