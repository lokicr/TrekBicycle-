package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {

    WebDriver driver;
    public NewCustomerPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "name")
    WebElement customerName;

    @FindBy (name = "rad1")
    WebElement radiobutton;

    @FindBy (id = "dob")
    WebElement DOB;

    @FindBy (name = "addr")
    WebElement address;

    @FindBy (name = "city")
    WebElement city;

    @FindBy (name = "state")
    WebElement state;

    @FindBy (name = "pinno")
    WebElement pincode;

    @FindBy (name = "telephoneno")
    WebElement telephone;

    @FindBy (name = "emailid")
    WebElement email;

    @FindBy (name = "sub")
    WebElement submitButton;

    public void customerName(String customername1)
    {
        customerName.sendKeys(customername1);
    }


    public void selectGender()
    {
        radiobutton.click();
    }


    public void enterdob(String DateOfBirth)
    {
        DOB.sendKeys(DateOfBirth);
    }

    public void enterAddress(String address1)
    {
        address.sendKeys(address1);
    }
    public void enterCity(String city1)
    {
        city.sendKeys(city1);
    }

    public void enterState(String state1)
    {
        state.sendKeys(state1);
    }

    public void enterPin(String pin1)
    {
        pincode.sendKeys(pin1);
    }
    public void enterTelephone(String telephone1)
    {
        telephone.sendKeys(telephone1);
    }
    public void enterEmail(String emailid1)
    {
        email.sendKeys(emailid1);
    }

    public void clickSubmitButton()
    {
        submitButton.click();
    }








}
