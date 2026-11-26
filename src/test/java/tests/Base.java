package tests;

import framework.driver.DriverManager;
import framework.utils.ConfigManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class Base {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = DriverManager.getDriver();
//        driver = DriverSettings.setHeadlessMode(driver);
    }

    @AfterEach
    public void quitDriver() {
        DriverManager.quitDriver();
    }

    void getPage(String property){
        driver.get(property);
    }

    String hostUrl() {
        return ConfigManager.getProperty("app.url");
    }


}


