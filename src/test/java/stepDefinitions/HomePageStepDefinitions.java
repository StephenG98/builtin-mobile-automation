package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class HomePageStepDefinitions extends BaseTest {

    protected IOSDriver<WebElement> driver;

    private Injector injector;

    public HomePageStepDefinitions(Injector injector) {
        this.injector = injector;
    }

    @Given("builtin.com is loaded and home page is visible")
    public void displayBuiltIn() {
        BaseTest baseTest = new BaseTest();
        baseTest.initialize();
        driver = baseTest.driver;

        injector.setDriver(driver);
        homePage = new HomePage(driver);

//        Assert.assertTrue(atHomePage);
    }

    @When("user swipes down to the sign up button")
    public void scrollDownToSignUpButton() {
        Double scrollStart = driver.manage().window().getSize().height * 0.5;
        int scrollStart_2 = scrollStart.intValue();

        Double scrollEnd = driver.manage().window().getSize().height * 0.2;
        int scrollEnd_2 = scrollEnd.intValue();

        int width = driver.manage().window().getSize().width / 2;

        TouchAction touchAction = new TouchAction(driver);

        for (int i = 0; i < 20; i++) {
            touchAction.longPress(PointOption.point(width, scrollStart_2)).moveTo(PointOption.point(width, scrollEnd_2))
                    .release().perform();
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        }
    }

    @And("user presses the sign up button")
    public void pressSignUpButton() {
        homePage.pressSignUpButton();
    }
}