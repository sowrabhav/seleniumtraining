package selenium.pageobjectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ch.qos.logback.classic.Logger;
import selenium.frameworkutilities.Utils;
import selenium.testcases.Tester;

public class SauceLabs_LoginPage {
    final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(SauceLabs_LoginPage.class);

    // WebElements for the login page
    @FindBy(id = "user-name")
    private WebElement usernameField;  // equivalent to usernameField = driver.findElement(By.id("user-name"))

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    // Constructor to initialize the elements
    public SauceLabs_LoginPage(WebDriver driver) {
        logger.info("Initializing Sauce Labs Login Page");
        PageFactory.initElements(driver, this);
    }

    // getters and setters for the elements
    public WebElement getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(String username) {
        // username - validation
        // getUsernameField - validation
        // sendKeys - outcome

        // username validation - null or empty, length, invalid characters, valid username
        logger.info("Setting username field with value: " + username);
        if (username == null || username.isEmpty()) {
            logger.error("Username is null or empty");
            throw new IllegalArgumentException("Username cannot be null or empty");
        } else if (username.length() > 20) {
            logger.error("Username exceeds maximum length of 20 characters");
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

    // Methods to interact with the elements
    public void enterUsername(String username) {
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
}