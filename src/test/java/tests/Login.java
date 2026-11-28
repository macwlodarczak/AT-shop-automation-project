package tests;

import framework.pages.BasePage;
import framework.pages.Dashboard;
import framework.pages.LoginPage;
import framework.utils.DriverSettings;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Login extends Base{

    @Test
    public void should_login_successfully() {

        LoginPage loginPage = new LoginPage(driver);
        DriverSettings.maximizeWindow(driver);
        Dashboard db = new Dashboard(driver);

        loginPage.getPage(BasePage.hostUrl());

        loginPage.login("client", "client");

        String welcomeTitle = db.getText(db.getWelcomeUserTitle());

        assertEquals("Welcome, Alice!", welcomeTitle, "should be \"Welcome, Alice!\"");

    }
}
