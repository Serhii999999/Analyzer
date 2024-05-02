package settingsPerEnv.reportAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.settings.DriverInit;

import static common.settings.DriverInit.driver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver= driver;
    }
    public void logInSystem(String login, String password) {
        driver.findElement(By.id("j_username")).sendKeys(login);
        driver.findElement(By.id("j_password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@name='Submit']")).click();
    }
}
