package testngtests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.ExtentReportPractice;

import java.util.logging.Logger;

public class SauceLabsLoginTests {
    WebDriver driver;
    Logger logger;
    ExtentReports extentReports;
    ExtentTest extentTest;

    SauceLabsLoginTests extentReportSauceLabsLoginTests;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - (Regression) Validate dependency tests are completed");
        // Validate dependency tests are completed
        // Maintain a flag for each test type (Smoke, Regression, Integration, etc.,)
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @BeforeClass
    public void setup() {
        logger = Logger.getLogger(SauceLabsLoginTests.class.getName());
        extentReportSauceLabsLoginTests = new SauceLabsLoginTests();
        extentReports = extentReportSauceLabsLoginTests.extentReportConfig("SauceLabsLoginTests", "/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/test/results/");
        System.out.println("Before class - Setting up the tests");
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        logger.info("Test started");
    }

//    @Test(priority = 1, groups = {"regression"}, dataProvider = "loginData", dataProviderClass = ExcelDataProvider.class)
    @Parameters({"userName", "password"})
    @Test(priority=1)
    public void loginSauceLabs(String userName, String password){
        extentTest = extentReports.createTest("swagLabsLoginFunctionality", "Test the login functionality of the Swag Labs application with user : " + userName);
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        logger.info("Test passed - StandardUser");
        extentTest.pass("Login successful for user: " + "StandardUser");
    }

//    @Test(groups = {"smoke"}, dependsOnMethods = {"testngtests.SauceLabsLoginTests.loginSauceLabs"})
    @Test(priority = 2, groups = {"smoke"})
    public void loginSauceLabs_performance_glitch_user(){
        extentTest = extentReports.createTest("swagLabsLoginFunctionality_performance", "Test the login functionality of the Swag Labs application with user : " + "performance_glitch_user");
        driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        logger.info("Test passed - PerformanceGlitchUser");
        extentTest.pass("Login successful for user: " + "performance_glitch_user");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Tearing down the test case");
        driver.quit();
        logger.info("Test finished");
    }

    @AfterClass
    public void teardown() {
        System.out.println("Tearing down the class");
        extentReports.flush();
    }


    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
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
