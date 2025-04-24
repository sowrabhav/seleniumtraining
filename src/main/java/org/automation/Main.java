package org.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;

public class Main {
    public void main1(String[] args) {
        System.out.println("Hello and welcome!");

        FirefoxOptions options = new FirefoxOptions()
                .addPreference("browser.startup.page", 1)
                .addPreference("browser.startup.homepage", "https://www.google.co.uk")
                .setAcceptInsecureCerts(true)
                .setProfile(new FirefoxProfile());
//                .setHeadless(true);

//            System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", "/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/main/resources/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver(options);

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

    public static void main(String[] args) {
//        System.out.println(System.getProperty("user.dir"));

        // Get the path to the root of the Gradle project
        String projectPath = System.getProperty("user.dir");

        // Print the project path
        System.out.println("Project Path: " + projectPath);

        // Example usage: Construct a path to a file in the project
        String filePath = projectPath + "/src/main/resources/drivers/geckodriver";
        System.out.println("File Path: " + filePath);


    }
}