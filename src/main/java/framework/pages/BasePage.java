package framework.pages;

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

    protected String getText(By locator) {
        waitManager.waitForElementVisible(locator);
        return driver.findElement(locator).getText();
    }
}
