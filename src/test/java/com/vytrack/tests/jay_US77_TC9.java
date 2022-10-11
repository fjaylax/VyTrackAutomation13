package com.vytrack.tests;

import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class jay_US77_TC9 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    /*
    @Test
    public void testDriverUser(){
        driver.get("https://qa2.vytrack.com/user/login");

        LogIn.vyTracklogin(driver, "user144","UserUser123");
        LogIn.verifyTitle(driver,"Dashboard");

        WebElement selectFleet = driver.findElement(By.xpath("//div[@id='main-menu']/ul/li[1]/a/span"));

        selectFleet.click();

        WebElement selectVehicle = driver.findElement(By.xpath("//span[.='Vehicles']"));
        selectVehicle.click();

        //WebElement verifyUncheckedBoxes = driver.findElement(By.xpath(""));
        WebElement verifyUncheckedBoxes = driver.findElement(By.xpath("//table[@class]/tbody//tr//td/input"));
        System.out.println("Verify if all checkboxes are selected: " + verifyUncheckedBoxes.isSelected());
        //table[@class]/tbody//tr//td/input
 driver.quit();

}



     */
    }
}