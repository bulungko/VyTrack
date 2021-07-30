package com.nextbaseCRM.stepDefintion;

import B22Group21.vytrack.utils.ConfigurationReader;
import B22Group21.vytrack.utils.Driver;
import com.nextbaseCRM.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDef {
    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
    }

    @When("As all users enter {string} and {string}")
    public void as_all_users_enter_and(String username,String password) {
        loginPage.usernameBar.sendKeys(username);
        loginPage.passwordBar.sendKeys(password);
        loginPage.loginButton.click();
    }

    @Then("user should see {string} on the profile")
    public void user_should_see_on_the_profile(String username) {
        Assert.assertEquals(username, loginPage.profileUser.getText());
        loginPage.profileUser.click();
        loginPage.logoutButton.click();
        Driver.getDriver().manage().deleteAllCookies();

    }
}


