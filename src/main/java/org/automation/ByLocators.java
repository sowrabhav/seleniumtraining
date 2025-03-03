package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLocators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        // Webdriver By locators

        // By id
        // By.id("id")
        // By id is the most efficient way to locate an element
        // By id is used to locate an element by id attribute

        WebElement googleSearchBox = driver.findElement(By.id("APjFqb"));
        googleSearchBox.sendKeys("Tajmahal");
        googleSearchBox.clear();

        // By name
        // By.name("name")
        // By name is the second most efficient way to locate an element
        // By name is used to locate an element by name attribute
        WebElement googleSearchBoxByName = driver.findElement(By.name("q"));
        googleSearchBoxByName.sendKeys("India Gate");
        googleSearchBoxByName.clear();

        // By class name
        // By.className("class")
        // By class name is used to locate an element by class attribute

        WebElement googleSearchBoxByClassName = driver.findElement(By.className("gLFyf"));
        googleSearchBoxByClassName.sendKeys("Qutub Minar");
        googleSearchBoxByClassName.clear();

        // By tag name
        // By.tagName("tagname")
        // By tagname is used to locate an element by tagname

        WebElement googleSearchBoxByTagName = driver.findElement(By.tagName("textarea"));
        googleSearchBoxByTagName.sendKeys("Red Fort");

        // By link text
        // By.linkText("linktext")
        // By linkText is used to locate an element by exact link text
        // By linkText only used to locate web links
        WebElement language = driver.findElement(By.linkText("తెలుగు"));
        language.click();
        Thread.sleep(2000);

        // By partial link text
        // By.partialLinkText("partiallinktext")
        // By partial link text is used to locate an element by partial link text
        // By partial link text is used to locate web links

        WebElement languagePartial = driver.findElement(By.partialLinkText("Englis"));
        languagePartial.click();

        // By css selector (Cascading Style Sheets)
        // By.cssSelector("cssselector")
        // By css selector is used to locate an element by css selector

//        html body div.L3eUgb div.o3j99.ikrT4e.om7nvf form div div.A8SBwf div.RNNXgb div.SDkEP div.a4bIc textarea#APjFqb.gLFyf
//        /html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[1]/div[2]/textarea -- absolute xpath
//        //textarea[@id='APjFqb'] -- relative xpath

        // By xpath
        // By.xpath("xpath")
        // By xpath is used to locate an element by xpath


        driver.quit();
    }
}
