package framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSettings {

    public static WebDriver setHeadlessMode_Chrome(WebDriver driver) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        return driver;
    }

    public static void maximizeWindow(WebDriver driver) {
         driver.manage().window().maximize();
    }


}
