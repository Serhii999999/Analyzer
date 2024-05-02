package settingsPerEnv.reportAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.services.Actions;
import common.settings.DriverInit;

import static common.settings.DriverInit.driver;

public class BuildPage {
    private WebDriver driver;
    private Actions actions;
    public BuildPage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }
    public BuildPage clickConsoleOutputButton(){
        actions.click(driver.findElement(By.xpath("//*[text()='Console Output']")));
        return new BuildPage(driver);
    }
    public BuildPage clickFullLogButton(){
        actions.click(driver.findElement(By.xpath("//a[text()='Full Log']")));
        return new BuildPage(driver);
    }
}
