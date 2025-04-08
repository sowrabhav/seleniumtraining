package saucelabs;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.IReporter;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SauceLabShopping {

    public static void main(String[] args) throws MalformedURLException {
        // 1. Instantiate the WebDriver
        FirefoxOptions options = new FirefoxOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:5555/wd/hub"), options);

        SauceLabShopping sauceLabShopping = new SauceLabShopping();
        sauceLabShopping.swagLabsLogin(driver);

        // convert into selenium grid code

    }


    /**

    */
    private void swagLabsLogin(WebDriver driver) {

        /**
         * 1. Instantiate the WebDriver - log
         * 2. Navigate to the URL - log
         * 3. Find the element - log (where to log is on object level)
         * 4. Perform the action - log (what action on the element)
         * 5. Close the browser - log
         * 6. Quit the WebDriver - log
         */

        // set browser properties
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Navigate to the URL
        driver.get("https://www.saucedemo.com/");

        // 3. Enter the username
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");



        // 4. Enter the password
        driver.findElement(By.cssSelector("input[type='password'][id='password']")).sendKeys("secret_sauce");

        // 5. Click on the login button
//        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("login-button")).submit();

        // 6. Validate the login is successful
        WebElement swag_Labs_Logo = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        Assertions.assertTrue(swag_Labs_Logo.isDisplayed());
        Assertions.assertEquals("Swag Labs", swag_Labs_Logo.getText());

        // 7. Logout from the application
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link")).click();

        // 8. Validate the logout is successful
        WebElement login_Button = driver.findElement(By.id("login-button"));
        Assertions.assertTrue(login_Button.isDisplayed());
        Assertions.assertEquals("Login", login_Button.getDomAttribute("value"));

        // 9. quit the WebDriver
        driver.quit();

    }

}
