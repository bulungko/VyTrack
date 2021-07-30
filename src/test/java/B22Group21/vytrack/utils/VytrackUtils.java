package B22Group21.vytrack.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class VytrackUtils {


    public static void logInAsTruckDriver1(WebDriver driver) {
        String url = ConfigurationReader.getProperties("url");
        String username = ConfigurationReader.getProperties("usernameT1");
        String password = ConfigurationReader.getProperties("password");
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password + Keys.ENTER);


        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle,expectedTitle,"Log In Failed As Truck driver 1");
    }

    public static void logInAsTruckDriver2(WebDriver driver) {
        String url = ConfigurationReader.getProperties("url");
        String username = ConfigurationReader.getProperties("usernameT2");
        String password = ConfigurationReader.getProperties("password");
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password + Keys.ENTER);


        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle,expectedTitle,"Log In Failed As Truck driver 2");
    }

    public static void logInAsTruckDriver3(WebDriver driver) {
        String url = ConfigurationReader.getProperties("url");
        String username = ConfigurationReader.getProperties("usernameT3");
        String password = ConfigurationReader.getProperties("password");
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password + Keys.ENTER);


        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle,expectedTitle,"Log In Failed As Truck driver 3");
    }
    public static void logInFailAsTruckDriverWithInvalidUserName(WebDriver driver,String username) {
        String url = ConfigurationReader.getProperties("url");
        driver.get(url);
        String password = ConfigurationReader.getProperties("password");
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password + Keys.ENTER);



        String actualText = driver.findElement(By.xpath(" //div[.='Invalid user name or password.']")).getText();
        String expectedText = "Invalid user name or password.";

        Assert.assertEquals(actualText,expectedText,"Log In with Invalid username and valid password verification Failed As Truck driver");
    }
    public static void logInFailAsTruckDriverWithInvalidPassword(WebDriver driver,String password) {
        String url = ConfigurationReader.getProperties("url");
        driver.get(url);
        String usernameT1 = ConfigurationReader.getProperties("usernameT1");
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(usernameT1);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password + Keys.ENTER);



        String actualText = driver.findElement(By.xpath(" //div[.='Invalid user name or password.']")).getText();
        String expectedText = "Invalid user name or password.";

        Assert.assertEquals(actualText,expectedText,"Log In with valid username and invalid password verification Failed As Truck driver");
    }
    public static void logInFailAsTruckDriverWoCredentials(WebDriver driver) {
        String url = ConfigurationReader.getProperties("url");
        driver.get(url);

       driver.findElement(By.xpath("//button[.='Log in']")).click();



        String actualText = driver.findElement(By.xpath(" //div[.='Invalid user name or password.']")).getText();
        String expectedText = "Invalid user name or password.";

    }

    public static void logInAsStoreManager1(WebDriver driver) {
        String url = ConfigurationReader.getProperties("url");
        String username = ConfigurationReader.getProperties("usernameStoreM1");
        String password = ConfigurationReader.getProperties("password");
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password + Keys.ENTER);


        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle,expectedTitle,"Log In Failed As Store Manager 1");
    }

    public static void logInAsStoreManager2(WebDriver driver) {
        String url = ConfigurationReader.getProperties("url");
        String username = ConfigurationReader.getProperties("usernameStoreM2");
        String password = ConfigurationReader.getProperties("password");
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password + Keys.ENTER);


        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle,expectedTitle,"Log In Failed As Store Manager 2");
    }

    public static void logInAsStoreManager3(WebDriver driver) {
        String url = ConfigurationReader.getProperties("url");
        String username = ConfigurationReader.getProperties("usernameStoreM3");
        String password = ConfigurationReader.getProperties("password");
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password + Keys.ENTER);


        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle,expectedTitle,"Log In Failed Store manager 3");
    }
    public static void logInAsSalesManager1(WebDriver driver) {
        String url = ConfigurationReader.getProperties("url");
        String username = ConfigurationReader.getProperties("usernameSalesM1");
        String password = ConfigurationReader.getProperties("password");
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password + Keys.ENTER);


        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle,expectedTitle,"Log In Failed As Store Manager 1");
    }

    public static void logInAsSalesManager2(WebDriver driver) {
        String url = ConfigurationReader.getProperties("url");
        String username = ConfigurationReader.getProperties("usernameSalesM2");
        String password = ConfigurationReader.getProperties("password");
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password + Keys.ENTER);


        String actualTitle = driver.getTitle();
        String expectedTitle = "Dashboard";

        Assert.assertEquals(actualTitle,expectedTitle,"Log In Failed As Sales Manager 2");
    }

public static void forgetPassword(WebDriver driver) {
    String url = ConfigurationReader.getProperties("url");
    driver.get(url);
    driver.findElement(By.xpath("//a[.='Forgot your password?']")).click();
}

}
