package com.nextbaseCRM.stepDefinition;

import B22Group21.vytrack.utils.ConfigurationReader;
import B22Group21.vytrack.utils.Driver;
import com.nextbaseCRM.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;


public class LoginStepDef {
    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
    }

    @When("As all users enter {string} and {string}")
    public void as_all_users_enter_and(String username, String password) {
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


    @Then("users cannot login")
    public void usersCannotLogin() {
        Assert.assertEquals("Incorrect login or password", loginPage.incorrectLoginMessage.getText());
    }


    @When("users login with  invalid username and password")
    public void usersLoginWithInvalidUsernameAndPassword(Map<String, String> credentials) {
        loginPage.usernameBar.sendKeys("username");
        loginPage.passwordBar.sendKeys("password");
        loginPage.loginButton.click();
    }

    @Then("user can click Remember me on this computer option")
    public void userCanClickRememberMeOnThisComputerOption() {

        Assert.assertTrue(loginPage.userRememberButton.isEnabled());

    }

    @When("user click FORGOT YOUR PASSWORD? button")
    public void user_click_forgot_your_password_button() {
        loginPage.forgotPasswordLink.click();

    }

    @Then("user can see Get Password as title")
    public void user_can_see_get_password_as_title() {
        Assert.assertEquals("Get Password", Driver.getDriver().getTitle());

    }

}



