package settingsPerEnv.reportAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.services.Actions;

public class ProjectPage {
    private WebDriver driver;
    private Actions actions;
    public ProjectPage(WebDriver driver){
        this.driver = driver;
        actions = new Actions(driver);
}
    public void clickBuildLink(){
        actions.click(driver.findElement(By.xpath("//a[@tooltip='Success > Console Output']")));
    }
}
