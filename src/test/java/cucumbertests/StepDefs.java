package cucumbertests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testngtests.SauceLabsLoginTests;

import java.util.logging.Logger;

public class StepDefs {

    static WebDriver driver;
    static Logger logger;
    static ExtentReports extentReports;
    ExtentTest extentTest;

    static StepDefs extentReportSauceLabsLoginTests;

    @Before
    public static void setup() {
        System.out.println("Before all - Setting up the tests");
        logger = Logger.getLogger(SauceLabsLoginTests.class.getName());
        extentReportSauceLabsLoginTests = new StepDefs();
        extentReports = extentReportSauceLabsLoginTests.extentReportConfig("SauceLabsLoginTests", "/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/test/results/");
        System.out.println("Before class - Setting up the tests");

        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        logger.info("Test started");
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        extentTest = extentReports.createTest("swagLabsLoginFunctionality", "Test the login functionality of the Swag Labs application with user : " + "StandardUser");
        driver.findElement(By.id("user-name")).sendKeys("standard_User");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        logger.info("Test passed - StandardUser");
        extentTest.pass("Login successful for user: " + "StandardUser");
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        driver.quit();
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @And("I click on login button")
    public void i_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be redirected to the home page")
    public void i_should_be_redirected_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    private static ExtentReports sampleExtentReport;

    private ExtentReports extentReportConfig(String reportName, String reportPath) {
        // Initialize the SparkReporter

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath + reportName + ".html");
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle("Extent Report Sample");
        sparkReporter.config().setReportName("Sample Test Report");

        // Initialize ExtentReports and attach the SparkReporter
        sampleExtentReport = new ExtentReports();
        sampleExtentReport.attachReporter(sparkReporter);

        // Set system info
        sampleExtentReport.setSystemInfo("OS", "macOS");
        sampleExtentReport.setSystemInfo("Environment", "Local");
        sampleExtentReport.setSystemInfo("User", "Baba");

        return sampleExtentReport;
    }

}
