package objectsandactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AppAndDriverSync {

    static WebDriver driver;
    static AppAndDriverSync appAndDriverSync = new AppAndDriverSync();

    public static void main(String[] args) {
        driver = appAndDriverSync.getDriver("chrome");


    }

    private void syncElement(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        

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
