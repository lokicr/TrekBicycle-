package TestCases;

import PageObjectModel.HomePage;
import PageObjectModel.NewCustomerPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AccountActions extends BaseClass{

    @Test(enabled = true)
    public void newAccount()
    {

        HomePage homePage=new HomePage(driver);
        homePage.clickonNewCustomer();

        NewCustomerPage newCustomerPage=  new NewCustomerPage(driver);
        newCustomerPage.customerName("lokesh");
        newCustomerPage.selectGender();
        newCustomerPage.enterdob("07091999");
        newCustomerPage.enterAddress("hosur");
        newCustomerPage.enterCity("hosur");
        newCustomerPage.enterState("tamilnadu");
        newCustomerPage.enterPin("123456");
        newCustomerPage.enterTelephone("1234567891");
        newCustomerPage.enterEmail("lokeshcr1999@gmail.com");
        newCustomerPage.clickSubmitButton();

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
