package tests;

import framework.driver.DriverManager;
import framework.utils.ConfigManager;
import framework.utils.DriverSettings;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class Base {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = DriverManager.getDriver();
//        driver = DriverSettings.setHeadlessMode(driver);
//        driver = DriverSettings.max
    }

    @AfterEach
    public void quitDriver() {
        DriverManager.quitDriver();
    }


}


