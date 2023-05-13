package org.example.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageBase {

    WebDriverWait webDriverWait;

    public PageBase(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        webDriverWait = new WebDriverWait(webDriver, 30);
    }

    public void click(WebElement webElement) {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    public void type(WebElement webElement, String Word) {
        webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.sendKeys(Word);
    }




}
