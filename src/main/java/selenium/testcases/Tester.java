package selenium.testcases;

import ch.qos.logback.classic.Logger;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.messages.types.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.drivermanagement.AppDriver;
import selenium.drivermanagement.Browser;
import selenium.frameworkutilities.Utils;
import selenium.pageobjectrepository.Products_Page;
import selenium.pageobjectrepository.SauceLabs_LoginPage;
import selenium.reporting.CustomReports;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Tester {
    static Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(Tester.class);
    static WebDriver driver;
    static SauceLabs_LoginPage sauceLabsLoginPage;

    public static void main(String[] args) {
        /*logger.info("Starting the Sauce Labs login test");

        // Webdriver initialization
        AppDriver appDriver = new AppDriver();
        appDriver.initializeDriver(Browser.CHROME);
        appDriver.getDriver().get("https://www.saucedemo.com/");

        sauceLabsLoginPage = new SauceLabs_LoginPage(appDriver.getDriver());

        // Generate a timestamp for the report file
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String reportPath = System.getProperty("user.dir")+"/results/";

        CustomReports customReports = new CustomReports("sauceLabsLoginPage_"+timestamp, reportPath);
        ExtentTest test = customReports.getReporting().createTest("Sauce Labs Login Test");

        sauceLabsLoginPage.enterUsername("standard_user");
        sauceLabsLoginPage.enterPassword(Utils.encryptPassword("secret_sauce"));
        sauceLabsLoginPage.clickLoginButton();
        test.pass("Login successful");

        customReports.getReporting().flush();
        appDriver.getDriver().quit();
        logger.info("Sauce Labs login test completed");*/

        Tester tester = new Tester();
        tester.loginTestCase();

    }

    public void loginTestCase(){
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String reportPath = System.getProperty("user.dir")+"/results/";

        CustomReports customReports = new CustomReports("sauceLabsLoginPage_"+timestamp, reportPath);
        ExtentTest test = customReports.getReporting().createTest("Sauce Labs Home Test");

        // Webdriver initialization
        AppDriver appDriver = new AppDriver();
        appDriver.initializeDriver(Browser.CHROME);
        appDriver.getDriver().get("https://www.saucedemo.com/");

        sauceLabsLoginPage = new SauceLabs_LoginPage(appDriver.getDriver());
        Products_Page productsPage = new Products_Page(appDriver.getDriver());

        sauceLabsLoginPage.setUsernameField("standard_user");
        sauceLabsLoginPage.setPasswordField(Utils.encryptPassword("secret_sauce"));
        sauceLabsLoginPage.clickLoginButton();

        if (productsPage.validateProductsPageTitle()){
            test.pass("Sauce Labs Home Page is displayed");
        }else{
            test.fail("Sauce Labs Home Page is not displayed");
        }

        customReports.getReporting().flush();
        appDriver.quitDriver();

    }
}
