package org.example.pages;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends PageBase {

    public ProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = "div.xw7yly9 > div > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) div.xquyuld > div > div:nth-child(2) > div > div > div:nth-child(3) div.x1qb5hxa div")
    public WebElement myLastPost;


}
