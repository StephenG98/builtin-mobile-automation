package pages;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

//    private IOSDriver driver;
//    private BasePage basePage;

//    @FindBy(xpath = "//*[@id=\"app-navigation\"]/div[1]/div[1]/div/div[1]/div/a/svg")
    private IOSElement builtinLogo;

//    @FindBy(xpath = "//*[@id=\"block-builtin-content\"]/div/div/div/div[2]/div/div[2]/div/div[4]/a")
//    private IOSElement signUpButton;
//    @FindBy(className = "frontpage-sign-up-cta")
    //IOSElement signUpButton = (IOSElement) driver.findElement(By.className("frontpage-sign-up-cta"));

    public HomePage(IOSDriver<WebElement> driver) {
        super(driver);
        driver.get("https://builtin.com/");
    }

//    public void locateSignUpButton() {
//    this.driver = BasePage(driver)
////        signUpButton = (IOSElement) driver.findElement(By.className("frontpage-sign-up-cta"));
//        signUpButton = (IOSElement) driver.findElement(By.xpath("//*[@id=\"block-builtin-content\"]/div/div/div/div[2]/div/div[2]/div/div[4]/a"));
//    }

    public void pressSignUpButton() {
        IOSElement signUpButton = (IOSElement) driver.findElement(By.className("frontpage-sign-up-cta"));
        signUpButton.click();
    }

    //TODO: figure out how to click the hamburger menu button

    //------
    //onScreen() is not currently supported (apparently for years).
//        System.out.println("sign up button x coordinate: " + signUpButton.getCoordinates().onScreen().getX());
//        System.out.println("sign up button y coordinate: " + signUpButton.getCoordinates().onScreen().getY());

//        System.out.println("sign up button x coordinate onPage: " + signUpButton.getCoordinates().onPage().getX());
//        System.out.println("sign up button y coordinate onPage: " + signUpButton.getCoordinates().onPage().getY());

//        System.out.println("sign up button x coordinate inViewPort: " + signUpButton.getCoordinates().inViewPort().getX());
//        System.out.println("sign up button y coordinate inViewPort: " + signUpButton.getCoordinates().inViewPort().getY());
}
