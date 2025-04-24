package cucumbertests;

import ch.qos.logback.classic.Logger;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.frameworkutilities.Utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepDefs {
    final ch.qos.logback.classic.Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(StepDefs.class);
    // WebElements for the login page
    @FindBy(id = "user-name")
    private WebElement usernameField;  // equivalent to usernameField = driver.findElement(By.id("user-name"))

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    WebDriver driver = null;

    @Given("Initialize the webdriver")
    public void initializeWebDriver() {
        driver = new ChromeDriver();
        logger.info("Initializing WebDriver");
        PageFactory.initElements(driver, this);
    }

    @Given("I Navigate to Sauce Labs application {string}")
    public void navigateToLoginPage(String url) {
        logger.info("Navigating to Sauce Labs Login Page");
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Given("I Navigate to SauceLabs application $\\{url}")
    public void navigateToLoginPage1(DataTable dataTable) {
        logger.info("Navigating to Sauce Labs Login Page");

        List<String> urls = dataTable.asList(String.class);

        for (String url : urls) {
            logger.info("URL: " + url);
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
    }

    @Then("I Quit the webdriver")
    public void quitDriver(){
        logger.info("Quitting the WebDriver");
        if (driver != null) {
            driver.quit();
        } else {
            logger.error("WebDriver is not initialized");
            throw new IllegalStateException("WebDriver is not initialized");
        }
    }

    // Constructor to initialize the elements
    /*public SauceLabs_LoginPage(WebDriver driver) {
        logger.info("Initializing Sauce Labs Login Page");
        PageFactory.initElements(driver, this);
    }*/

    // Constructor to initialize the elements
    public StepDefs() {
        logger.info("Initializing Sauce Labs Login Page");
    }

    // getters and setters for the elements
    public WebElement getUsernameField() {
        return usernameField;
    }

    /*@Then("I enter username {string}")
    public void enterUsername(String username) {
        System.out.println("Entering username: " + username);
        // Add logic to interact with the username field
        // e.g., driver.findElement(By.id("username")).sendKeys(username);
    }*/

//    @When("I enter username {username}")
    public void setUsernameField(String username) {
        // username - validation
        // getUsernameField - validation
        // sendKeys - outcome

        // username validation - null or empty, length, invalid characters, valid username
        logger.info("Setting username field with value: " + username);
        if (username == null || username.isEmpty()) {
            logger.error("Username is null or empty");
            throw new IllegalArgumentException("Username cannot be null or empty");
        } else if (username.length() > 30) {
            logger.error("Username exceeds maximum length of 30 characters");
            throw new IllegalArgumentException("Username exceeds maximum length of 20 characters");
        } else if (!username.matches("^[a-zA-Z0-9._-]+$")) {
            logger.error("Username contains invalid characters");
            throw new IllegalArgumentException("Username contains invalid characters");
        } else {
            try{
                logger.info("Valid username entered");
                getUsernameField().clear();
                getUsernameField().sendKeys(username);
            } catch (Exception e) {
                logger.error("Invalid username entered");
                throw new IllegalArgumentException("Invalid username entered");
            }
        }

    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    @When("I enter password {string}")
    public void setPasswordField(String encryptedPassword) {
        String decryptedPassword = Utils.decryptPassword(encryptedPassword);

        logger.info("Entering password: " + encryptedPassword);
        // Password validation
        if (decryptedPassword == null || decryptedPassword.isEmpty()) {
            logger.error("Password is null or empty");
            throw new IllegalArgumentException("Password cannot be null or empty");
        } else if (decryptedPassword.length() > 20) {
            logger.error("Password exceeds maximum length of 20 characters");
            throw new IllegalArgumentException("Password exceeds maximum length of 20 characters");
        } else if (!decryptedPassword.matches("^[a-zA-Z0-9._-]+$")) {
            logger.error("Password contains invalid characters");
            throw new IllegalArgumentException("Password contains invalid characters");
        }

        // passwordField validation
        if (getPasswordField() == null) {
            logger.error("Password field is not initialized");
            throw new IllegalStateException("Password field is not initialized");
        } else if (getPasswordField().isEnabled() && getPasswordField().isDisplayed()) {
            logger.info("Password field is displayed and enabled");
            getPasswordField().clear();
            getPasswordField().sendKeys(decryptedPassword);
        } else {
            logger.error("Password field is not displayed");
            throw new IllegalStateException("Password field is not displayed");
        }
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    @Then("I enter username $\\{username}")
    public void i_enter_username_$(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<String> usernames = dataTable.asList(String.class);

        for (String username : usernames) {
            logger.info("Username: " + username);
            setUsernameField(username);
            Thread.sleep(2000);
        }

    }

    // Methods to interact with the elements
    @Then("I enter username {string}")
    public void enterUsername(String username, DataTable dataTable) {
        logger.info("Entering username: " + username);

        // Username validation
        if (username == null || username.isEmpty()) {
            logger.error("Username is null or empty");
            throw new IllegalArgumentException("Username cannot be null or empty");
        } else if (username.length() > 20) {
            logger.error("Username exceeds maximum length of 20 characters");
            throw new IllegalArgumentException("Username exceeds maximum length of 20 characters");
        } else if (!username.matches("^[a-zA-Z0-9._-]+$")) {
            logger.error("Username contains invalid characters");
            throw new IllegalArgumentException("Username contains invalid characters");
        } else if (username.equals("standard_user")) {
            logger.info("Valid username entered");
        } else {
            logger.error("Invalid username entered");
            throw new IllegalArgumentException("Invalid username entered");
        }

        // usenameField validation
        if (usernameField == null) {
            logger.error("Username field is not initialized");
            throw new IllegalStateException("Username field is not initialized");
        } else if (usernameField.isEnabled() && usernameField.isDisplayed()) {
            logger.info("Username field is displayed and enabled");
            usernameField.clear();
            usernameField.sendKeys(username);
        } else {
            logger.error("Username field is not displayed");
            throw new IllegalStateException("Username field is not displayed");
        }
    }

    public void enterPassword(String encryptedPassword) {
        String decryptedPassword = Utils.decryptPassword(encryptedPassword);

        logger.info("Entering password: " + encryptedPassword);
        // Password validation
        if (decryptedPassword == null || decryptedPassword.isEmpty()) {
            logger.error("Password is null or empty");
            throw new IllegalArgumentException("Password cannot be null or empty");
        } else if (decryptedPassword.length() > 20) {
            logger.error("Password exceeds maximum length of 20 characters");
            throw new IllegalArgumentException("Password exceeds maximum length of 20 characters");
        } else if (!decryptedPassword.matches("^[a-zA-Z0-9._-]+$")) {
            logger.error("Password contains invalid characters");
            throw new IllegalArgumentException("Password contains invalid characters");
        } else if (decryptedPassword.equals("secret_sauce")) {
            logger.info("Valid password entered");
        } else {
            logger.error("Invalid password entered");
            throw new IllegalArgumentException("Invalid password entered");
        }

        // passwordField validation
        if (passwordField == null) {
            logger.error("Password field is not initialized");
            throw new IllegalStateException("Password field is not initialized");
        } else if (passwordField.isEnabled() && passwordField.isDisplayed()) {
            logger.info("Password field is displayed and enabled");
            passwordField.clear();
            passwordField.sendKeys(decryptedPassword);
        } else {
            logger.error("Password field is not displayed");
            throw new IllegalStateException("Password field is not displayed");
        }

    }

    @When("I click on the login button")
    public void clickLoginButton() {
        logger.info("Clicking the login button");

        // loginButton validation
        if (loginButton == null) {
            logger.error("Login button is not initialized");
            throw new IllegalStateException("Login button is not initialized");
        } else if (loginButton.isEnabled() && loginButton.isDisplayed()) {
            logger.info("Login button is displayed and enabled");
            loginButton.click();
        } else {
            logger.error("Login button is not displayed");
            throw new IllegalStateException("Login button is not displayed");
        }

    }

   /* static WebDriver driver;
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
*/
}
