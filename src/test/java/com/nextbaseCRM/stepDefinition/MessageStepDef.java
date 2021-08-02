package com.nextbaseCRM.stepDefinition;

import B22Group21.vytrack.utils.Driver;
import com.nextbaseCRM.pages.LoginPage;
import com.nextbaseCRM.pages.MessagePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;


public class MessageStepDef {

    MessagePage messagePage = new MessagePage();
    String expectedText = "Happy Monday";


    @Then("user can see message is displayed as expected")
    public void user_can_see_message_is_displayed_as_expected() {
        Assert.assertEquals(expectedText, messagePage.sentMessageInActivityStream.getText());
    }

    @When("user click attach link icon and attach link")
    public void user_click_attach_link_icon_and_attach_link() {
        messagePage.attachLinkButton.click();
        messagePage.linkTextBar.sendKeys("Apple Store");
        messagePage.linkUrlLBar.sendKeys("www.apple.com");
        messagePage.linkSaveButton.click();
        messagePage.messageSendButton.click();
    }

    @Then("user can click the link that lead to link page")
    public void user_can_click_the_link_that_lead_to_link_page() {
        messagePage.attachLinkText.click();
        String expectedTitle = "Apple";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }


    @When("user click message tab")
    public void userClickMessageTab() {
        messagePage.messageButton.click();
    }

    @When("user write the message and clicking tab")
    public void userWriteTheMessageAndClickingTab() {
        Driver.getDriver().switchTo().frame(messagePage.iframeForMessage);
        messagePage.getIframeMessageBody.sendKeys(expectedText);
        Driver.getDriver().switchTo().defaultContent();
        messagePage.messageSendButton.click();
    }

    @Then("user can cancel message")
    public void userCanCancelMessage() {
        Driver.getDriver().switchTo().frame(messagePage.iframeForMessage);
        messagePage.getIframeMessageBody.sendKeys(expectedText);
        Driver.getDriver().switchTo().defaultContent();
        messagePage.messageCancelButton.click();
    }
}

