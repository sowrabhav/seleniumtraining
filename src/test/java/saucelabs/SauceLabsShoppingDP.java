package saucelabs;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

/**
 * Run saucelabs shopping application with multiple sets of data
 * */
public class SauceLabsShoppingDP {
    // outside source for testdata
//    1. Excel
//    2. CSV / Flatfile
//    3. Database
//    4. xml
//    5. Json
//    6. Yaml

    static SauceLabsShoppingDP sauceLabShopping = new SauceLabsShoppingDP();

    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new FirefoxDriver();

        sauceLabShopping.driverManagement(driver);
        sauceLabShopping.swagLabsLoginFunctionality(driver);
        sauceLabShopping.driverQuit(driver);
    }

    // Description: Test the login functionality of the Swag Labs application
    // input types: Different types of users
    private void swagLabsLoginFunctionality(WebDriver driver){
        // 2. Navigate to the URL
        driver.get("https://www.saucedemo.com/");

        // Pre-requisites: Access Testdata from excel
        try {
            FileInputStream inputExcel = new FileInputStream("/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/test/resources/SauceLabs_Users.xls");
            Workbook workbook = new HSSFWorkbook(inputExcel); //.xls, .xlsx XSSFWor

            Sheet sheet = workbook.getSheet("TestData");

            // Workbook --> Sheet --> Row --> Cell
            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row row = sheet.getRow(i);
                /*for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                    System.out.print(row.getCell(j).getStringCellValue() + " ");
                }*/
                // Step 1: Login to the application
                sauceLabShopping.swagLabsLogin(driver, row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        // Step 2: Validate the login is successful for valid users

    }

    private void driverManagement(WebDriver driver) {
        // set browser properties
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    private void driverQuit(WebDriver driver){
        // 9. quit the WebDriver
        driver.quit();
    }

    // Description: Test all Items page working as expected in saucelabs application
    // input types:
    private void allItemsPageFunctionality(){

    }


    // Description: Test the login functionality of the Swag Labs application

    private void swagLabsLogin(WebDriver driver, String userName, String Password) {

        /**
         * 1. Instantiate the WebDriver
         * 2. Navigate to the URL
         * 3. Find the element
         * 4. Perform the action
         * 5. Close the browser
         * 6. Quit the WebDriver
         */

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

    }
}
