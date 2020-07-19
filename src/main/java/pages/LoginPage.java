package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private IOSDriver<WebElement> driver;

    private IOSElement loginText;
    private IOSElement recruitWithUsButton;

    public LoginPage(IOSDriver<WebElement> driver) {
        super(driver);
    }

    //*[@id="app"]/div[2]/div/div/div[1]/div/div/text()

    public boolean isAtLoginPage() {
        loginText = (IOSElement) driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/div/div/text()"));
        recruitWithUsButton = (IOSElement) driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div[1]/a"));
//        return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[1]/div/div/text()")).getText().equals("Log In");
        return loginText.getText().equals("Log In")
                && recruitWithUsButton.isEnabled()
                && driver.getCurrentUrl().equals("https://builtin.com/login");
    }
}
