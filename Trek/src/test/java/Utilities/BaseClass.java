package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    public WebDriver driver;
    public Properties properties;

    @BeforeClass
    public void setup() throws IOException {

        FileReader fileReader=new FileReader("C:\\Users\\Lokesh\\.m2\\TrekBicycle-\\Trek\\config.properties");
        properties=new Properties();
        properties.load(fileReader);
         driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V1/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(properties.getProperty("userId"));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(properties.getProperty("password"));
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

    }

    @AfterClass
    public void teardown() {

        if (driver != null) {
            driver.quit();
        }
    }
}
