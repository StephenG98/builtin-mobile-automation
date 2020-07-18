package pages;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public IOSDriver<WebElement> driver;

    public BasePage(IOSDriver<WebElement> driver) {
        this.driver = driver;
//        PageFactory.initElements(driver, this);
    }
}
