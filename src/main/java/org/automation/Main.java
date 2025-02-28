package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

//            System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/main/resources/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();

        // set browser properties
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("sessionKey");

        driver.get("https://www.google.com"); // initialize your application
        WebElement element = driver.findElement(By.name("q")); // find the element

        element.sendKeys("Tajmahal");

//        element.submit();
        driver.quit();
    }
}