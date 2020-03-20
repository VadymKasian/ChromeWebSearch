package com.ChromeWebSearch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void testBrowser(){
        String searchQuery = "test";

        System.setProperty("webdriver.chrome.driver","D:/java/programs/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com.ua/");
        BrowserSearch browser = new BrowserSearch(driver);
        browser.browserSearch(searchQuery);

        Assert.assertEquals(browser.getTitle(), searchQuery + " - Google Search");

        driver.close();
    }

    @Test
    public void testBrowserWithRuby(){
        String searchQuery = "Ruby";

        System.setProperty("webdriver.chrome.driver","D:/java/programs/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com.ua/");
        BrowserSearch browser = new BrowserSearch(driver);
        browser.browserSearch(searchQuery);

        Assert.assertEquals(browser.getTitle(), searchQuery + " - Google Search");

        driver.close();
    }
}
