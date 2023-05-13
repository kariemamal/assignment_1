package tests;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends TestBase {

    LoginPage loginPage;
    HomePage homePage;

    @Test
    @Parameters({"userName", "password"}) /* these value is invoked from testng.xml file */
    public void loginUser(String userName, String password) {
        loginPage = new LoginPage(webDriver);
        homePage = new HomePage(webDriver);
        loginPage.loginUser(userName, password);
        assertElementIsDisplay(homePage.homePageIcon);
//        Assert.assertTrue(homePage.homePageIcon.isDisplayed());
    }
}
