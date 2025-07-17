package TestCases;

import PageObjectModel.HomePage;
import PageObjectModel.NewCustomerPage;
import Utilities.BaseClass;
import org.testng.annotations.Test;

public class create_New_Customer extends BaseClass {

    @Test(enabled = true)
    public void Add_New_Customer()
    {
        //Home page data elements actions
        HomePage homePage=new HomePage(driver);
        homePage.clickonNewCustomer();

        //NewCustomer Page data elements actions
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
       // newCustomerPage.clickSubmitButton(); Having some issues in application i just sent an mail regarding this issue.

    }
}
