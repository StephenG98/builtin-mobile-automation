package stepDefinitions;

import cucumber.api.Scenario;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;

public class Injector {

//    Scenario scn;

    IOSDriver<WebElement> driver;

    public IOSDriver<WebElement> getDriver() {
        return driver;
    }

    public void setDriver(IOSDriver<WebElement> driver) {
        this.driver = driver;
    }
}
