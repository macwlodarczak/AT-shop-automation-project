package framework.pages;

import framework.utils.ConfigManager;
import framework.waits.WaitManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BasePage {
    protected WebDriver driver;
    protected WaitManager waitManager;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.waitManager = new WaitManager(driver);
    }

    protected void click (By locator) {
        waitManager.waitForElementClickable(locator);
        driver.findElement(locator).click();
    }
    protected void enterText(By locator, String text) {
        waitManager.waitForElementVisible(locator);
        driver.findElement(locator).sendKeys(text);
    }

    public String getText(By locator) {
        waitManager.waitForElementVisible(locator);
        return driver.findElement(locator).getText();
    }

     public void getPage(String property){
        driver.get(property);
    }

    public static String hostUrl() {
        return ConfigManager.getProperty("app.url");
    }

}
