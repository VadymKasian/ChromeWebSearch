package com.testChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserSearch {
    String searchQuery = "test";

    @Test
    public void testBrowser(){
        System.setProperty("webdriver.chrome.driver","D:/java/selenium/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com.ua/");

        WebElement inputTypeSearch = driver.findElement(By.name("q"));
        inputTypeSearch.sendKeys(searchQuery);
        inputTypeSearch.sendKeys(Keys.ENTER);

        Assert.assertEquals(driver.getTitle(), searchQuery + " - Google Search");

        //driver.close();
    }
}
