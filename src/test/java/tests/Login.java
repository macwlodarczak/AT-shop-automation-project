package tests;

import framework.pages.BasePage;
import framework.pages.Dashboard;
import framework.pages.LoginPage;
import framework.utils.TestDataFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Login extends Base {

    @Test
    public void should_login_successfully_When_correct_credentials() {
        TestDataFactory td = new TestDataFactory();
        LoginPage loginPage = new LoginPage(driver);
        Dashboard db = new Dashboard(driver);

        td.createUsersCredentialsToLogin("client");
        loginPage.getPage(BasePage.hostUrl());
        loginPage.login(td.clientUsername(), td.clientPassword());

        String welcomeTitle = db.getWelcomeTitle();
        assertEquals(String.format("Welcome, %s!", td.clientFirstName()), welcomeTitle, "should be \"Welcome, Alice!\"");
    }
}
