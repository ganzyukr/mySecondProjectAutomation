package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    WebElement signInButton = driver.findElement(By.xpath("//a[contains(text(),\"Sign in\")]"));

    private final static String TITLE = "Home page";
    public HomePage(WebDriver driver) {

        super(driver, TITLE);
    }

    public LoginPage goToLoginPage(){
        signInButton.click();
        return new LoginPage(driver);

    }
}
