import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabTests {
    public static void main(String[] args) {
        SauceLabTests test = new SauceLabTests();
        WebDriver driver = new ChromeDriver();
        test.swagLabsLogin(driver);
        test.quitSwagLabs(driver);
    }

    private void swagLabsLogin(WebDriver driver) {
        driver.get("https://www.saucedemo.com");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

    }

    private void quitSwagLabs(WebDriver driver){
        driver.quit();
    }
}
