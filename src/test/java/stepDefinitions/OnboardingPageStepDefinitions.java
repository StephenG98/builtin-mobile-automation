package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.OnboardingPage;

public class OnboardingPageStepDefinitions extends BaseTest {

    protected IOSDriver<WebElement> driver;

    OnboardingPage communityPage = new OnboardingPage(driver);

    private Injector injector;

    public OnboardingPageStepDefinitions(Injector injector) {
        this.injector = injector;
    }

    @Given("onboarding page is displayed")
    public void thenCommunityPageIsDisplayed() {
        this.driver = injector.getDriver();

        communityPage = new OnboardingPage(driver);
        Assert.assertTrue(communityPage.urlIsCommunityPageURL());
        Assert.assertTrue(communityPage.isLoginButtonEnabled());
    }

    @When("user presses the login button")
    public void whenUserPressesLoginButton() {
        communityPage.pressLoginButton();
    }

//    @Given("community page is displayed")
//    public void givenCommunityPageIsDisplayed() {
//
//    }
}
