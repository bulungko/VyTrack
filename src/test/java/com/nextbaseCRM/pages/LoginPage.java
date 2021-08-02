package com.nextbaseCRM.pages;

import B22Group21.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement profileUser;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@placeholder='Login']")
    public WebElement usernameBar;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordBar;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutButton;

    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement incorrectLoginMessage;

    @FindBy(id = "USER_REMEMBER")
    public WebElement userRememberButton;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPasswordLink;



}
