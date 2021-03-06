package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

public class LoginPageStepDefinitions extends BaseTest {

    private IOSDriver<WebElement> driver;
    private Injector injector;

    private LoginPage loginPage;

    public LoginPageStepDefinitions(Injector injector) {
        this.injector = injector;
    }

    @Given("driver is initialized and login page is displayed")
    public void givenLoginPageIsDisplayed() {
        BaseTest baseTest = new BaseTest();
        baseTest.initialize();
        driver = baseTest.driver;

        injector.setDriver(driver);
        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isAtLoginPage());
    }

    @Then("the login page is displayed")
    public void thenLoginPageIsDisplayed() {
        this.driver = injector.getDriver();

        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isAtLoginPage());

        cleanUp(driver);
    }

//    @When("sign up button is pressed inside login page")
//    public void whenSignUpButtonInsideLoginIsPressed() {
//
//    }
}