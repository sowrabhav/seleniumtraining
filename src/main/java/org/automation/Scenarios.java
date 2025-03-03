package org.automation;

//import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Scenarios {

    public static void main(String[] args) {

    }

    private void googleLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.xpath("//*[contains(@id,'gb')]//iframe")));
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();

        // Switch to the tab with the specific title
        String targetTitle = "Sign in - Google Accounts";
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals(targetTitle)) {
                break;
            }
        }

        Thread.sleep(2000);
        driver.findElement(By.id("identifierId")).sendKeys("bfakruddin@gmail.com");
        driver.findElement(By.xpath("//span[contains(text(), 'Next')]/../../button")).click();
        Thread.sleep(2000);
        driver.quit();
    }

    private void googleSearch(){
        System.setProperty("webdriver.gecko.driver", "/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/main/resources/drivers/geckodriver");

        // WebDriver initialization
        WebDriver driver = new FirefoxDriver();

        // Configure browser properties
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // Invoke the application
        driver.get("https://www.google.com");

        // google search functionality

        // find the element
        driver.findElement(By.name("q")).sendKeys("Tajmahal");

        // validate the results
        Assertions.assertEquals("Google", driver.getTitle());

        // close the browser
//        driver.close();
        driver.quit();
    }

    private void chromeSearch(){
        // WebDriver initialization
        WebDriver driver = new ChromeDriver();

        // Configure browser properties
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // Invoke the application
        driver.get("https://www.google.com");

        // find the element
        driver.findElement(By.name("q")).sendKeys("Tajmahal");

        // close the browser
        driver.close();
        driver.quit();
    }

    private void edgeSearch(){
        // WebDriver initialization
        WebDriver driver = new EdgeDriver();

        // Configure browser properties
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // Invoke the application
        driver.get("https://www.google.com");

        // find the element
        driver.findElement(By.name("q")).sendKeys("Tajmahal");

        // close the browser
        driver.close();
        driver.quit();
    }

}
