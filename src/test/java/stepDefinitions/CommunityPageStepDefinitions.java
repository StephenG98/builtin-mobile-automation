package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.CommunityPage;

public class CommunityPageStepDefinitions extends BaseTest {

    protected IOSDriver<WebElement> driver;

    private Injector injector;

    public CommunityPageStepDefinitions(Injector injector) {
        this.injector = injector;
    }

    @Then("community page is displayed")
    public void thenCommunityPageIsDisplayed() {
        this.driver = injector.getDriver();

        CommunityPage communityPage = new CommunityPage(driver);
        Assert.assertTrue(communityPage.urlIsCommunityPageURL());
        Assert.assertTrue(communityPage.isLoginButtonEnabled());
    }

//    @Given("community page is displayed")
//    public void givenCommunityPageIsDisplayed() {
//
//    }
}
