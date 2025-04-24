package saucelabs;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class SauceLabsExceptions {
    Logger log = LoggerFactory.getLogger(SauceLabsExceptions.class);

    public static void main(String[] args) {
        SauceLabsExceptions sauceLabsExceptions = new SauceLabsExceptions();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        sauceLabsExceptions.swagLabsValidUsersLogin(driver, "standard_user", "secret_sauce");
        driver.quit();
    }


    private void swagLabsValidUsersLogin(WebDriver driver, String userName, String Password) {
        // 3. Enter the username
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(userName);

        // 4. Enter the password
        driver.findElement(By.cssSelector("input[type='password'][id='password']")).sendKeys(Password);

        // 5. Click on the login button
        driver.findElement(By.id("login-button")).submit();

        // Validate no errors occured on login page
        List<WebElement> error_Message = driver.findElements(By.xpath("//h3[@data-test='error']"));
        Assertions.assertTrue(error_Message.isEmpty(), "Error message is displayed, but it should not be.");

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

    }


    public void useDeleteFileOnExit(){
        User_Framework user_Framework = new User_Framework();
        try {
            user_Framework.deleteFileOnExit("test.txt");
        } catch (Exception e) {
            log.error("user_Framework.deleteFileOnExit() --> IOException: ", e.getMessage());
            System.exit(1);
        } finally {
            log.debug("user_Framework.deleteFileOnExit() --> Finally block executed");
            // Perform any cleanup or final actions here
        }
    }


}


class User_Framework{

    public void deleteFileOnExit(String path) throws IOException {

        // path is null
        if (path == null) {
            throw new IllegalArgumentException("Path cannot be null");
        }

        File file = new File(path);
        file.createNewFile();
        file.setWritable(true);

        String filePath = file.getAbsolutePath();
        System.out.println("File created at: " + filePath);

        String input = "Hello, World!";
        java.io.FileWriter writer = new java.io.FileWriter(file);
        writer.write(input);

        // used the file for some operations

        file.deleteOnExit();
    }

}
