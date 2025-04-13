package testngtests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class CrossBrowserWithGrid {

    @Test
    public void test1() throws MalformedURLException {
        System.out.println("Test 1");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.MAC);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium Grid");
        searchBox.submit();

        driver.quit();
        System.out.println("Test 1");
    }

    @Test
    public void test2() throws MalformedURLException {
        System.out.println("Test 2");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        capabilities.setPlatform(Platform.MAC);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium Grid");
        searchBox.submit();

        driver.quit();
        System.out.println("Test 1");
    }

    @Test
    public void test3() throws MalformedURLException {
        System.out.println("Test 2");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("safari");
        capabilities.setPlatform(Platform.MAC);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium Grid");
        searchBox.submit();

        driver.quit();
        System.out.println("Test 1");
    }

/*
    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) throws MalformedURLException {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }

    @Test
    public void test() {
        driver.get("https://google.com");
        // Your test code here
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(dataProvider = "loginData", dataProviderClass = ExcelDataProvider.class)
    public void swagLabsLoginFunctionality(String userName, String password) {
        System.out.println("Username: " + userName + " Password: " + password);
        // Your test code here
    }

    private void swagLabsLogin(WebDriver driver, String userName, String Password) {

        *//**
         * 1. Instantiate the WebDriver
         * 2. Navigate to the URL
         * 3. Find the element
         * 4. Perform the action
         * 5. Close the browser
         * 6. Quit the WebDriver
         *//*

        // 3. Enter the username
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(userName);

        // 4. Enter the password
        driver.findElement(By.cssSelector("input[type='password'][id='password']")).sendKeys(Password);

        // 5. Click on the login button
//        driver.findElement(By.id("login-button")).click();
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

    }*/
}
