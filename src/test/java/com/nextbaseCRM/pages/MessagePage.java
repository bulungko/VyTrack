package com.nextbaseCRM.pages;

import B22Group21.vytrack.utils.Driver;
import com.nextbaseCRM.stepDefinition.MessageStepDef;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {

    public MessagePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "blog-submit-button-save")
    public WebElement messageSendButton;

    @FindBy(xpath = "//span[.='Message']")
    public WebElement messageButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframeForMessage;

    @FindBy(xpath = "//body")
    public WebElement getIframeMessageBody;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement messageCancelButton;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement attachLinkButton;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTextBar;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrlLBar;

    @FindBy(xpath = "//div[@id='blog_post_body_4450']")
    public WebElement sentMessageInActivityStream;

    @FindBy(id="undefined")
public WebElement linkSaveButton;

    @FindBy(xpath = "//a[.='Apple store']")
public WebElement attachLinkText;
}
