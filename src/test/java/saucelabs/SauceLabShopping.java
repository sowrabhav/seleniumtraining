package saucelabs;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabShopping {
    public static void main(String[] args) {
        SauceLabShopping sauceLabShopping = new SauceLabShopping();
        sauceLabShopping.swagLabsLogin();



    }

    private void swagLabsLogin(){

        /**
         * 1. Instantiate the WebDriver
         * 2. Navigate to the URL
         * 3. Find the element
         * 4. Perform the action
         * 5. Close the browser
         * 6. Quit the WebDriver
         */

        // 1. Instantiate the WebDriver
        WebDriver driver = new ChromeDriver();
        // set browser properties
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // 2. Navigate to the URL
        driver.get("https://www.saucedemo.com/");

        // 3. Enter the username
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");

        // 4. Enter the password
        driver.findElement(By.cssSelector("input[type='password'][id='password']")).sendKeys("secret_sauce");

        // 5. Click on the login button
        driver.findElement(By.id("login-button")).click();

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
