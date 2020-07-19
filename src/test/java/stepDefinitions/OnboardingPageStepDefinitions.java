package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.OnboardingPage;

public class OnboardingPageStepDefinitions extends BaseTest {

    protected IOSDriver<WebElement> driver;

    OnboardingPage onboardingPage;

    private Injector injector;

    public OnboardingPageStepDefinitions(Injector injector) {
        this.injector = injector;
    }

    @Then("onboarding page is displayed")
    public void thenOnboardingPageIsDisplayed() {
        this.driver = injector.getDriver();

        onboardingPage = new OnboardingPage(driver);
        Assert.assertTrue(onboardingPage.urlIsOnboardingPageURL());
        Assert.assertTrue(onboardingPage.isLoginButtonEnabled());
    }

    @Given("driver is initialized and onboarding page is displayed")
    public void givenOnboardingPageIsDisplayed() {
        BaseTest baseTest = new BaseTest();
        baseTest.initialize();
        driver = baseTest.driver;

        injector.setDriver(driver);
//        homePage = new HomePage(driver);
        onboardingPage = new OnboardingPage(driver);
    }

    @When("user presses the login button")
    public void whenUserPressesLoginButton() {
        onboardingPage.pressLoginButton();
    }

//    @Given("community page is displayed")
//    public void givenCommunityPageIsDisplayed() {
//
//    }
}
