package objectsandactions;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class AppAndDriverSync {

    static WebDriver driver;
    static AppAndDriverSync appAndDriverSync = new AppAndDriverSync();

    public static void main(String[] args) throws InterruptedException {
        driver = appAndDriverSync.getDriver("chrome");

        appAndDriverSync.syncElement(driver);
    }

    private void syncElement(WebDriver driver) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();

        int max_time = 0;
        // Wait for the loading to disappear by thread.sleep
        while (driver.findElement(By.id("loading")).isDisplayed() || max_time >= 10) {
            System.out.println("Waiting for loading to disappear");
            Thread.sleep(1000);
            max_time++;
        }

        // Explicit Wait for the loading to disappear
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));

        // Fluent Wait for the loading to disappear
        /*Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(2))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(TimeoutException.class)
                .ignoring(NullPointerException.class);

        fluentWait.until(ExpectedConditions.textToBe(By.id("message"), "It's gone!"));*/

        /*fluentWait.until(new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                WebElement loadingElement = driver.findElement(By.id("loading"));
                return !loadingElement.isDisplayed();
            }
        });*/

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
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set implicit wait
        return driver;

    }

}
