package org.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserActions {
    static WebDriver driver;
    static BrowserActions browserActions = new BrowserActions();

    public static void main(String[] args) {
        browserActions.getDriver("chrome");

        driver.get("https://www.google.com");

        driver.get("https://www.facebook.com");

        driver.get("https://www.microsoft.com");

        // Open a new tab and switch to it
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.facebook.com', '_blank');");

        driver.navigate().to("https://www.facebook.com");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());

        browserActions.navigateBack();
        browserActions.navigateForward();

        driver.quit();
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void navigateForward() {
        driver.navigate().forward();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void closeBrowser() {
        driver.quit();
    }

    public WebDriver getDriver(String browser) {

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;

    }
}
