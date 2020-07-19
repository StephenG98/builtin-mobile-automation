package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnboardingPage extends BasePage {

    private IOSElement loginButton;

    public OnboardingPage(IOSDriver<WebElement> driver) {
        super(driver);
        driver.get("https://builtin.com/onboarding");
    }

    public boolean urlIsOnboardingPageURL() {
        return driver.getCurrentUrl().equals("https://builtin.com/onboarding");
    }

//    public boolean isLoginButtonEnabled() {
////        loginButton = (IOSElement) driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/div/div[2]"));
//        return loginButton.isEnabled();
//    }

    public void pressLoginButton() {
//        loginButton = (IOSElement) driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/div/div[2]"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        loginButton = (IOSElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.className("login")));
//        loginButton = (IOSElement) driver.findElement(By.className("login"));
        //*[@id="app"]/div[2]/div/div/div[1]/div/div[2]/a for xpath

        loginButton.click();
    }
}