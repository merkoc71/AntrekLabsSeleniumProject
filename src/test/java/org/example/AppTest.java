package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class AppTest extends BaseTest
{

    @Test(priority = 1)
    public void login() throws InterruptedException {
        WebElement loginElement = driver.findElement(By.xpath("//*[@name='email']"));
        loginElement.click();
        loginElement.sendKeys("admin@phptravels.com");
        WebElement passwordElement = driver.findElement(By.xpath("//*[@name='password']"));
        passwordElement.click();
        passwordElement.sendKeys("demoadmin");
        WebElement btnSubmit = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block ladda-button fadeIn animated btn-lg']"));
        btnSubmit.click();
        Thread.sleep(10000);
        List<WebElement> li = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li[@class='dropdown']"));
        System.out.println(li.size());
    }

    @Test(priority = 2)
    public void clickCustomers() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> li = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li[@class='dropdown']"));
        System.out.println(li.size());
        Actions action = new Actions(driver);
        action.moveToElement(li.get(1)).build().perform();
        WebElement customers = driver.findElement(By.xpath("//*[@class='dropdown-menu dropdowns-menu']/li/a[@href='https://phptravels.net/api/admin/accounts/customers/']"));
        action.moveToElement(customers).click().build().perform();
    }

    @Test(priority = 3)
    public void clickAdd() throws InterruptedException {
        Thread.sleep(3000);
        WebElement addElement = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
        addElement.click();
}

    @Test(priority = 4)
    public void fillForms() throws InterruptedException {
        Thread.sleep(3000);
        WebElement fname = driver.findElement(By.xpath("//input[@name='fname']"));
        fname.click();
        fname.sendKeys("Muhammed");
        WebElement sname = driver.findElement(By.xpath("//input[@name='lname']"));
        sname.click();
        sname.sendKeys("Erkoç");
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.click();
        email.sendKeys("doganerkoc@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.click();
        password.sendKeys("123456");
        WebElement mobileNumber = driver.findElement(By.xpath("//input[@name='mobile']"));
        mobileNumber.click();
        mobileNumber.sendKeys("5555554125");
        Thread.sleep(2000);
        /*WebElement dropdownCountry = driver.findElement(By.xpath("//span[@class='select2-arrow']"));
        dropdownCountry.click();
        Thread.sleep(2000);*/
        Select inputArea = new Select(driver.findElement(By.xpath("//select[@class='chosen-select select2-offscreen']")));
        inputArea.selectByVisibleText("Turkey");
        WebElement address1= driver.findElement(By.xpath("//input[@name='address1']"));
        address1.click();
        address1.sendKeys("Testçi Sokak");
        WebElement address2 = driver.findElement(By.xpath("//input[@name='address2']"));
        address2.click();
        address2.sendKeys("Yazılımcı Mah.");
        Select dropdownCurrency = new Select(driver.findElement(By.xpath("//select[@name='currency']")));
        dropdownCurrency.selectByValue("TRY");
        WebElement balance = driver.findElement(By.xpath("//input[@name='balance']"));
        balance.sendKeys("10000");
        WebElement submitButton = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-lg']"));
        submitButton.click();
        Thread.sleep(5000);

    }

}
