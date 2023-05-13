package tests;

import org.example.pages.HomePage;
import org.example.pages.ProfilePage;
import org.testng.annotations.Test;

public class Home extends TestBase {


    HomePage homePage;
    ProfilePage profilePage;


    @Test
    public void posting() {
        homePage = new HomePage(webDriver);
        profilePage = new ProfilePage(webDriver);
        homePage.createPost("Hello World");
        webDriver.navigate().refresh();
        homePage.click(homePage.profileButton);
        assertIsEqual(profilePage.myLastPost, "Hello World");

    }
}
