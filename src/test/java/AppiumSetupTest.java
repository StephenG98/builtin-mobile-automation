import io.appium.java_client.*;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppiumSetupTest {


//    @FindBy(xpath = "//*[@id=\"app-navigation\"]/div[1]/div[1]/div/div[1]/div/a/svg")
    private IOSElement builtinLogo;

//    @Test
    public void navigateToBuiltIn() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);

//        if (driver.queryAppState("com.apple.mobilesafari").toString().equals("RUNNING_IN_FOREGROUND")) {
//            driver.get("http://builtin.com");
//        }
//        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//*[@id=\"app-navigation\"]/div[1]/div[1]/div/div[2]/div/div")));

        //TODO: figure out how to click the hamburger menu button
//        driver.findElement(MobileBy.xpath("//*[@id=\"app-navigation\"]/div[1]/div[1]/div/div[2]/div/div")).click();
//        System.out.println("should've clicked hamburger menu button");

//        IOSElement signUpButton = (IOSElement) driver.findElement(By.className("frontpage-sign-up-cta"));

        //onScreen() is not currently supported (apparently for years).
//        System.out.println("sign up button x coordinate: " + signUpButton.getCoordinates().onScreen().getX());
//        System.out.println("sign up button y coordinate: " + signUpButton.getCoordinates().onScreen().getY());

//        System.out.println("sign up button x coordinate onPage: " + signUpButton.getCoordinates().onPage().getX());
//        System.out.println("sign up button y coordinate onPage: " + signUpButton.getCoordinates().onPage().getY());

//        System.out.println("sign up button x coordinate inViewPort: " + signUpButton.getCoordinates().inViewPort().getX());
//        System.out.println("sign up button y coordinate inViewPort: " + signUpButton.getCoordinates().inViewPort().getY());
    }
}
