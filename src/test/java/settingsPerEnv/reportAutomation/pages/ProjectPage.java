package settingsPerEnv.reportAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.services.Actions;
import common.settings.DriverInit;

import static common.settings.DriverInit.driver;

public class ProjectPage {
    public ProjectPage(){
    WebDriver driver = DriverInit.getDriver();

}
    public ProjectPage clickBuildLink(){
        Actions.click(driver.findElement(By.xpath("//a[@tooltip='Success > Console Output']")));
        return new ProjectPage();
    }
}
