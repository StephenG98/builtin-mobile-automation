package stepDefinitions;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public IOSDriver<WebElement> driver;
    public HomePage homePage;

    public void initialize() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException exception) {
            exception.printStackTrace();
        } finally {
            driver = new IOSDriver<WebElement>(url, desiredCapabilities);
            homePage = new HomePage(driver);
        }
    }

    public void cleanUp() {
        driver.close();
        driver.quit();
    }
}
