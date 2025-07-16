package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccountActions extends BaseClass{

    @Test(enabled = true)
    public void newAccount()
    {
        driver.findElement(By.xpath("//a[text()='New Customer']")).click();
        driver.findElement(By.name("rad1")).click();
        driver.findElement(By.id("dob")).sendKeys("07091999");
        driver.findElement(By.name("addr")).sendKeys("Hosur");
        driver.findElement(By.name("city")).sendKeys("Hosur");
        driver.findElement(By.name("state")).sendKeys("tamilnadu");
        driver.findElement(By.name("pinno")).sendKeys("635107");
        driver.findElement(By.name("telephoneno")).sendKeys("123456789");
        driver.findElement(By.name("emailid")).sendKeys("lokesgcr1999@gmail.com");
        driver.findElement(By.name("sub")).click();

    }

    public void editAccount()
    {

    }

    public void deleteAccount()
    {

    }

    public void miniStatement()
    {

    }









}
