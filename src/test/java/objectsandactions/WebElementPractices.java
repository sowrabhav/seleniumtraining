package objectsandactions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class WebElementPractices {

    static WebDriver driver;
    static WebElementPractices webElementPractices = new WebElementPractices();

    public static void main(String[] args) throws InterruptedException {
        driver = webElementPractices.getDriver("chrome");
//        driver.get("https://the-internet.herokuapp.com/login");
//        webElementPractices.login(driver);
//        webElementPractices.button(driver);

//        driver.get("https://the-internet.herokuapp.com/checkboxes");
//        webElementPractices.checkBox(driver);

//        driver.get("https://the-internet.herokuapp.com/context_menu");
//        webElementPractices.actions(driver);

        System.out.println("Hello World");

    }

    private void actions(WebDriver driver) {
        WebElement element = driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);
        actions.scrollToElement(element).perform();
        actions.contextClick(element).perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }

    private void login(WebDriver driver) {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    }

    private void textBox(){

    }

    private void checkBox(WebDriver driver) throws InterruptedException {
        // Turn on checkbox 1
        if (!driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).isSelected()) {
            driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).click();
            Thread.sleep(2000);
        }

        // Turn off checkbox 2
        if (driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected()) {
            driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).click();
            Thread.sleep(2000);
        }
        driver.quit();

    }

    private void radioButton(){

    }

    private void dropDown(){

    }

    private void button(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/logout']")).click();

        driver.quit();
    }

    private void link(){

    }

    private void image(){

    }

    private void label(){

    }

    private void table(){

    }

    private void form(){

    }

    private void alert(){

    }

    private void iframe(){

    }


    public WebDriver getDriver(String browser) {

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        return driver;

    }
}
