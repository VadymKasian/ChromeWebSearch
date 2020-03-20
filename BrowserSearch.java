package com.testChrome;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BrowserSearch {
    String searchQuery = "test";
    WebDriver driver;

    @Test
    public void testBrowser(){
        System.setProperty("webdriver.chrome.driver","D:/java/selenium/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com.ua/");
        Browser browser = new Browser(driver);
        browser.browserSearch(searchQuery);

        Assert.assertEquals(browser.getTitle(), searchQuery + " - Google Search");

        driver.close();
    }
}

class Browser{
    WebDriver driver;

    String pageTitle;
    @FindBy(name = "q")
    private WebElement searchInput;

    Browser(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void browserSearch(String text){
        searchInput.sendKeys(text);
        searchInput.sendKeys(Keys.ENTER);
        pageTitle = text + " - Google Search";
    }

    public String getTitle(){
        return pageTitle;
    }
}
