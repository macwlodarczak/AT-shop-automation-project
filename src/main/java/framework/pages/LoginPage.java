package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By usernameInputField = By.id("username");
    private By passwordInputField = By.id("password");
    private By signInBtn = By.xpath("//button[text()='Sign in']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        enterText(usernameInputField, "client");
        enterText(passwordInputField, "client");
        click(signInBtn);
    }
}
