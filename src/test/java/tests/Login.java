package tests;

import framework.pages.BasePage;
import framework.pages.Dashboard;
import framework.pages.LoginPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Login extends Base {

    @Test
    public void should_login_successfully() {

        LoginPage loginPage = new LoginPage(driver);
        Dashboard db = new Dashboard(driver);

        loginPage.getPage(BasePage.hostUrl());
        loginPage.login("client", "client");

        String welcomeTitle = db.getWelcomeTitle();
        assertEquals("Welcome, Alice!", welcomeTitle, "should be \"Welcome, Alice!\"");


    }
}
