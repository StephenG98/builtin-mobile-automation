package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

//    private IOSDriver<WebElement> driver;

    private IOSElement loginText;
    private IOSElement recruitWithUsButton;

    public LoginPage(IOSDriver<WebElement> driver) {
        super(driver);
        driver.get("https://builtin.com/login");
    }

    //*[@id="app"]/div[2]/div/div/div[1]/div/div/text()

    public boolean isAtLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        // TODO change xpath to className
        loginText = (IOSElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/div/div/text()")));
        recruitWithUsButton = (IOSElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[3]/div/div[1]/a")));

        return loginText.getText().equals("Log In")
                && recruitWithUsButton.isEnabled()
                && driver.getCurrentUrl().equals("https://builtin.com/login");
    }
}
