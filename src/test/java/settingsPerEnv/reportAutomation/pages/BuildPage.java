package settingsPerEnv.reportAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.services.Actions;
import common.settings.DriverInit;

import static common.settings.DriverInit.driver;

public class BuildPage {
    public BuildPage() {
        WebDriver driver = DriverInit.getDriver();
    }
    public BuildPage clickConsoleOutputButton(){
        Actions.click(driver.findElement(By.xpath("//*[text()='Console Output']")));
        return new BuildPage();
    }
    public BuildPage clickFullLogButton(){
        Actions.click(driver.findElement(By.xpath("//a[text()='Full Log']")));
        return new BuildPage();
    }
}
