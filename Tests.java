package com.ChromeWebSearch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {
    ChromeDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","D:/java/programs/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testBrowser(){
        String searchQuery = "test";

        driver.get("http://google.com.ua/");
        BrowserSearch browser = new BrowserSearch(driver);
        browser.browserSearch(searchQuery);

        Assert.assertEquals(browser.getTitle(), searchQuery + " - Google Search");
    }

    @Test
    public void testBrowserWithRuby(){
        String searchQuery = "Ruby";

        driver.get("http://google.com.ua/");
        BrowserSearch browser = new BrowserSearch(driver);
        browser.browserSearch(searchQuery);

        Assert.assertEquals(browser.getTitle(), searchQuery + " - Google Search");
    }

    @AfterTest
    public void closeConnections(){
        driver.close();
    }
}

