package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard extends BasePage{
    private By  welcomeUserTitle = By.xpath("//h1[@data-testid='home-welcome-title']");

    public Dashboard(WebDriver driver) {
        super(driver);
    }


    public String getWelcomeTitle() {
        return getText(welcomeUserTitle);
    }

}
