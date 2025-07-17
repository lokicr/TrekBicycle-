package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {

    WebDriver driver;

    public NewAccountPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "cusid")
    WebElement customerId;

    @FindBy(name = "selaccount")
    WebElement acountType;

    @FindBy(name="inideposit")
    WebElement initialDeposit;

    @FindBy(xpath="//input[@type='submit']")
    WebElement submitButton;

    @FindBy(name="reset")
    WebElement reset;



    public void enterCustomerId(String customerId1)
    {
        customerId.sendKeys(customerId1);
    }

    public void selectAccountType(String accountType1)
    {
        Select select=new Select(acountType);
        select.selectByValue(accountType1);
    }

    public void enterInitialDeposite(String amount)
    {
        initialDeposit.sendKeys(amount);
    }

    public void clickOnSubmit()
    {
        submitButton.click();
    }

    public void clickreset()
    {
        reset.click();
    }





}
