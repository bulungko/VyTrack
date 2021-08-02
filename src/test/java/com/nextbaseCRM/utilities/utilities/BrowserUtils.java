package com.nextbaseCRM.utilities.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    /**
     * Method that will accept int
     * Wait for given second duration
     */

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("Something is happening on Thread.sleep method");
        }

    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> getElText = new ArrayList<>();
        for (WebElement webElement : list) {
            getElText.add(webElement.getText());
        }
        return getElText;
    }

    public static void assertTitle(String expectedTitle) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs(expectedTitle));

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }


}
