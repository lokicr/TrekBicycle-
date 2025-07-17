package TestCases;

import PageObjectModel.HomePage;
import PageObjectModel.NewAccountPage;
import Utilities.BaseClass;
import org.testng.annotations.Test;

public class create_New_Account extends BaseClass {


    @Test
    public void add_New_Account_Form()
    {
        //Home page data elements actions
        HomePage homePage=new HomePage(driver);
        homePage.clickonNewAccount();

        //New Account Page data elements actions
        NewAccountPage newAccountPage=new NewAccountPage(driver);
        newAccountPage.enterCustomerId("123456");
        newAccountPage.selectAccountType("savings");
        newAccountPage.enterInitialDeposite("500");
       // newAccountPage.clickOnSubmit();
    }
}