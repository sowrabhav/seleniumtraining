package selenium.drivermanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import static org.openqa.selenium.remote.Browser.OPERA;

public class AppDriver {
    WebDriver driver;
    // This class is a placeholder for the AppDriver class.
    // It can be used to manage the WebDriver instance and provide utility methods for test execution.
    // You can add methods to initialize, quit, and manage the WebDriver instance here.

    // Example method to initialize the WebDriver
    public void initializeDriver(Browser browserType) {
        // Code to initialize the WebDriver based on the browser type
        // For example, if the browser type is "chrome", initialize ChromeDriver
        switch (browserType) {
            case CHROME -> {
                driver = new ChromeDriver();
                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
                break;
            }
            case FIREFOX -> {
                driver = new FirefoxDriver();
                System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
                break;
            }
            case EDGE -> {
                driver = new EdgeDriver();
                System.setProperty("webdriver.edge.driver", "path/to/msedgedriver");
                break;
            }

            case SAFARI -> {
                driver = new SafariDriver();
                // SafariDriver does not require a driver path, but you can add any specific setup here
                break;
            }
            case OPERA -> {
                // Example for Opera, you can add the driver initialization here
                System.setProperty("webdriver.opera.driver", "path/to/operadriver");
                driver = new OperaDriver();
                break;
            }

            default -> throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        }

        setDriver(driver);
    }

    // Example method to quit the WebDriver
    public void quitDriver() {
        // Code to quit the WebDriver
        driver.quit();
    }

    // getters and setters
    public WebDriver getDriver() {
        driver.manage().timeouts().implicitlyWait(30, java.util.concurrent.TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

}
