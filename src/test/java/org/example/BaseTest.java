package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BaseTest {
    WebDriver driver;
    @Test(priority = 0)
    public void start(){
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        ChromeOptions optıons=new ChromeOptions();
        optıons.addArguments("start-maximized");
        driver = new ChromeDriver(optıons);
        driver.get("https://phptravels.net/api/admin\n");
    }
    @Test(priority = 5)
    public void fınısh(){
        driver.close();
        driver.quit();





    }
}
