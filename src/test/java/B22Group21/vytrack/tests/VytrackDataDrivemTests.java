package B22Group21.vytrack.tests;

import B22Group21.vytrack.utils.ConfigurationReader;
import B22Group21.vytrack.utils.VytrackUtils;
import B22Group21.vytrack.utils.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VytrackDataDrivemTests {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
       String browser = ConfigurationReader.getProperties("browser");
        driver= WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void testLoginAsTruckDriver1() {
        VytrackUtils.logInAsTruckDriver1(driver);

    }
    @Test
    public void testLoginAsTruckDriver2() {
        VytrackUtils.logInAsTruckDriver2(driver);

    }
    @Test
    public void testLoginAsTruckDriver3() {


        VytrackUtils.logInAsTruckDriver3(driver);
    }
    @Test
    public void testLoginAsStoreManager1() {
        VytrackUtils.logInAsStoreManager1(driver);

    }
    @Test
    public void testLoginAsStoreManager2() {
        VytrackUtils.logInAsStoreManager2(driver);

    }
    @Test
    public void testLoginAsStoreManager3() {


        VytrackUtils.logInAsStoreManager3(driver);
    }
    @Test
    public void testLoginAsSalesManager1() {
        VytrackUtils.logInAsSalesManager1(driver);

    }
    @Test
    public void testLoginAsSalesManager2() {
        VytrackUtils.logInAsSalesManager2(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver. quit();
    }

}
