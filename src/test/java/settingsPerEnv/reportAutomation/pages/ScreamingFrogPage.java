package settingsPerEnv.reportAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.services.Actions;
import common.settings.DriverInit;

import static common.settings.DriverInit.driver;

public class ScreamingFrogPage {
    private WebDriver driver;
    private Actions actions;
    public ScreamingFrogPage(WebDriver driver){
        this.driver = driver;
        actions = new Actions(driver);

    }
    public ScreamingFrogPage frogLink(){
        actions.clickWithJS(driver.findElement(By.xpath("//span[text()='ScreamingFrog']")));
        return new ScreamingFrogPage(driver);
    }
    public ScreamingFrogPage preprodLinkClick(){
        actions.clickWithJS(driver.findElement(By.xpath("//td//span[text()='preprod']")));
        return new ScreamingFrogPage(driver);
    }
    public ScreamingFrogPage prodLinkClick(){
        actions.clickWithJS(driver.findElement(By.xpath("//td//span[text()='prod']")));
        return new ScreamingFrogPage(driver);
    }

}
