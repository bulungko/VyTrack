package B22Group21.vytrack.tests;

import B22Group21.vytrack.utils.BrowserUtil;
import B22Group21.vytrack.utils.ConfigurationReader;
import B22Group21.vytrack.utils.Driver;
import B22Group21.vytrack.utils.VytrackUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FleetVehiclesButtons {

    // Test cases 1:
    //   Given, the vehichles pages,
    //   When, click Export Grid dropdown,
    //   Then, the dropdown options should be displayed.

    @Test
    public void ExportGridDropdownTest() {
        String url = ConfigurationReader.getProperties("url");
        Driver.getDriver().get(url);
        VytrackUtils.logInAsSalesManager1(Driver.getDriver());
        WebElement fleet = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleet.click();
        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();
        WebElement exportGrid = Driver.getDriver().findElement(By.xpath("(//a[@data-toggle='dropdown'])[4]"));


        Assert.assertTrue(exportGrid.isDisplayed(), "Export Grid DropDown is not displayed");

    }

    @Test
    public void GridSettingButtonTest() {
        String url = ConfigurationReader.getProperties("url");
        Driver.getDriver().get(url);
        VytrackUtils.logInAsSalesManager1(Driver.getDriver());
        WebElement fleet = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
        fleet.click();
        WebElement vehicles = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));
        vehicles.click();
        BrowserUtil.sleep(2);
        WebElement gridSetting = Driver.getDriver().findElement(By.xpath("//a[@title='Grid Settings']"));
        BrowserUtil.sleep(2);
        gridSetting.click();
        //verify the web page width
        //if getX from Grid setting button is larger than half of webpage width,
        //Grid setting button is right side of page.
        int pageWidth = Driver.getDriver().manage().window().getSize().getWidth();

        BrowserUtil.sleep(2);
        Point pointOfGrid = gridSetting.getLocation();

        BrowserUtil.sleep(2);
        int  getX = pointOfGrid.getX();

        BrowserUtil.sleep(2);
        int gridWidth = gridSetting.getSize().getWidth();

        BrowserUtil.sleep(2);
        Assert.assertTrue((getX+gridWidth) > pageWidth/2 );
    }
}
