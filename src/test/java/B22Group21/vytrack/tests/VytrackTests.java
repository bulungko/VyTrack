package B22Group21.vytrack.tests;

import B22Group21.vytrack.utils.ConfigurationReader;
import B22Group21.vytrack.utils.VytrackUtils;
import B22Group21.vytrack.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VytrackTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String browser = ConfigurationReader.getProperties("browser");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void logInFailAsTruckDriver1() {
        VytrackUtils.logInFailAsTruckDriverWithInvalidUserName(driver, "user");
    }
    @Test
    public void logInFailAsTruckDriver2() {
        VytrackUtils.logInFailAsTruckDriverWithInvalidPassword(driver,"Password");
    }
    @Test
    public void logInFailAsTruckDriver3() {
       VytrackUtils.logInFailAsTruckDriverWoCredentials(driver);
    }


    @AfterMethod
    public void tearDown() {
        //driver.close();
    }
}
