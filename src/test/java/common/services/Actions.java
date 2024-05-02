package common.services;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import settingsPerEnv.reportAutomation.services.Constants;
import settingsPerEnv.reportAutomation.services.UrlService;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static common.settings.DriverInit.driver;
import static settingsPerEnv.reportAutomation.services.Constants.REGEX_FOR_PAGES;

public class Actions {
    private WebDriver driver;
    public Actions(WebDriver driver){
        this.driver= driver;
    }
    public  void open(String url){
        driver.navigate().to(url);
    }
    public  void click(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable
                (element));
        if(element.isDisplayed()){
            element.click();
        }
    }
    public void clickWithJS(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }
    public  void navigateBack(){
        driver.navigate().back();
    }

//    public static int retrieveNumberFromPage(String pattern){
//        String desiredText = "";
//        WebElement preElement = new WebDriverWait
//                (driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.tagName("pre")));
//        String preText = preElement.getText();
//        String url = "https://casinosanalyzer.com/";
//        String constructedPattern = "\"Site Crawled\",\"" + url + "/\".*?" + Constants.REGEX_FOR_500;
//        Pattern patternMatch = Pattern.compile(constructedPattern, Pattern.DOTALL);
//        Matcher matcher = patternMatch.matcher(preText);
//
//        while (matcher.find()) {
//            desiredText = matcher.group(1);
//        }
//        return Integer.parseInt(desiredText);
//    }

    public  boolean areApproximatelyEqual(int val1, int val2, int threshold){
        int difference = Math.abs(val1-val2);
        return difference <= threshold;
    }
    public  int retrieveNumberFromPage(String p, String url) {
        WebElement preElement = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.tagName("pre")));
        String preText = preElement.getText();

        String pattern = "\"Site Crawled\",\"" + url + "/\".*?" + p;
        Pattern patternMatch = Pattern.compile(pattern, Pattern.DOTALL);
        Matcher matcher = patternMatch.matcher(preText);

        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        } else {
            throw new RuntimeException("Pattern not found in the page content");
        }
    }


}
