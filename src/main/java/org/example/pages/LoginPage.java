package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase {

    WebDriverWait webDriverWait;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        webDriverWait = new WebDriverWait(webDriver, 30);
    }

    public void loginUser(String userName, String password) {
        type(emailField, userName);
        type(passwordField, password);
        click(loginButton);
    }

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(css = "form:nth-child(1) div:nth-child(6) button")
    WebElement loginButton;


}


