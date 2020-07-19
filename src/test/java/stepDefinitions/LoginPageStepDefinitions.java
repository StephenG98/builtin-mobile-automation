package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.LoginPage;

public class LoginPageStepDefinitions {

    private IOSDriver<WebElement> driver;
    private Injector injector;

    private LoginPage loginPage;


    @Given("driver is initialized and login page is displayed")
    public void givenLoginPageIsDisplayed() {
        BaseTest baseTest = new BaseTest();
        baseTest.initialize();
        driver = baseTest.driver;

        injector.setDriver(driver);
        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isAtLoginPage());
    }

    @Then("login page is displayed")
    public void thenLoginPageIsDisplayed() {
        this.driver = injector.getDriver();

        loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isAtLoginPage());
    }

//    @When("sign up button is pressed inside login page")
//    public void whenSignUpButtonInsideLoginIsPressed() {
//
//    }
}