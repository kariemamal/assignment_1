package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }


    @FindBy(css = "div.x1emribx div.x9e5oc1")
    WebElement createIcon;

    @FindBy(css = "div.xp7jhwk div.xjl7jj:nth-child(2) div.x7wzq59 > div.xh8yej3 > div > div:nth-child(2) >div:nth-child(1)")
    WebElement createPost;

    @FindBy(css = "P.x16tdsg8")
    WebElement postingField;
    @FindBy(css = "div.x11pth41 > div:nth-child(2) div.x1vjfegm")
    WebElement postingPopup;
    @FindBy(css = "div.x11pth41 > div:nth-child(3) > div:nth-child(2) >div")
    WebElement postingButton;
    @FindBy(css = "div.x9e5oc1:nth-child(2) div.x1t2pt76 > div >div:nth-child(1) div.xw7yly9 > div > div:nth-child(1) > ul:nth-child(1) li a svg.x3ajldb")
    public WebElement profileButton;
    @FindBy(css = "div.xmy5rp div.xh8yej3 label.xmjcpbm > input")
    WebElement SearchFiled;
    @FindBy(css = "div.x1vjfegm > div > div ul:nth-child(1) li:nth-child(1)")
    public WebElement homePageIcon;


    public void createPost(String postText) {
        click(createIcon);
        click(createPost);
        type(postingField, postText);
        click(postingButton);

    }


}
