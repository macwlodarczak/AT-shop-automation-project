package tests;

import framework.pages.LoginPage;
import org.junit.jupiter.api.Test;

public class Login extends Base{

    @Test
    public void should_login_successfully() {
        getPage(hostUrl());
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("client", "client");


    }
}
