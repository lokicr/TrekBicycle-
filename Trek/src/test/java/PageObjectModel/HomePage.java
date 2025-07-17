package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='New Customer']")
    WebElement newCustomer;

    @FindBy(xpath = "//a[text()='New Account']")
    WebElement newAccount;

    public void clickonNewCustomer()
    {
        newCustomer.click();
    }

    public void clickonNewAccount()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", newAccount);

    }

}
