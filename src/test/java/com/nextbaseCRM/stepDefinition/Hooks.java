package com.nextbaseCRM.stepDefinition;

import B22Group21.vytrack.utils.ConfigurationReader;
import B22Group21.vytrack.utils.Driver;
import com.nextbaseCRM.pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class Hooks {
    LoginPage loginPage = new LoginPage();
    @Before
    public void user_is_on_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        String email = ConfigurationReader.getProperties("hrUserName");
        String pw = ConfigurationReader.getProperties("password");
        loginPage.usernameBar.sendKeys(email);
        loginPage.passwordBar.sendKeys(pw);
        loginPage.loginButton.click();
    }




}
