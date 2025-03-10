package objectsandactions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;

public class WebElementPractices {

    static WebDriver driver;
    static WebElementPractices webElementPractices = new WebElementPractices();

    public static void main(String[] args) throws InterruptedException {
        driver = webElementPractices.getDriver("chrome");
//        webElementPractices.login(driver);
//        webElementPractices.button(driver);

//        webElementPractices.checkBox(driver);
//        webElementPractices.actions(driver);
//        webElementPractices.basicAuthentication(driver);
//        webElementPractices.digestiveAuthentication(driver);
//        webElementPractices.dragAndDrop(driver);
//        webElementPractices.dropDown(driver);
//        webElementPractices.fileDownload(driver);
//        webElementPractices.fileUpload(driver);
//        webElementPractices.floatingMenu(driver);
        webElementPractices.frames(driver);
        webElementPractices.multipleWindows(driver);
//        webElementPractices.multipleTabs(driver);
//        webElementPractices.horizontalSlide(driver);
//        webElementPractices.hovers(driver);
//        webElementPractices.jscriptAlerts(driver);
//        webElementPractices.jscriptError(driver);
//        webElementPractices.keyPresses(driver);
//        webElementPractices.jScriptExecutor(driver);

        System.out.println("Hello World");

    }

    private void multipleTabs(WebDriver driver) {
        // Open the first URL
        driver.get("https://www.google.com");
        System.out.println("Title of first tab: " + driver.getTitle());

        // Open a new tab and switch to it
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.facebook.com', '_blank');");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        System.out.println("Title of second tab: " + driver.getTitle());

        // Perform actions in the new tab
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("your-email@example.com");

        // Switch back to the original tab
        driver.switchTo().window(tabs.get(0));
        System.out.println("Title of first tab after switching back: " + driver.getTitle());

        driver.quit();
    }

    private void jScriptExecutor(WebDriver driver) {
        driver.get("https://www.saucedemo.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Enter username
        js.executeScript("document.getElementById('user-name').value='standard_user';");

        // Enter password
        js.executeScript("document.getElementById('password').value='secret_sauce';");

        // Click login button
        js.executeScript("document.getElementById('login-button').click();");

        driver.quit();
    }

    private void typos(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/typos");
        WebElement element = driver.findElement(By.xpath("//p[contains(text(),'This example demonstrates a typo.')]"));
        System.out.println(element.getText());
        driver.quit();
    }

    private void multipleWindows(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);

            if(driver.getTitle().equals("New Window")){
                System.out.println("You are in the new window");
                break;
            }
        }

        driver.quit();
    }

    private void keyPresses(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/key_presses");
        WebElement body = driver.findElement(By.id("target"));

        Actions actions = new Actions(driver);
        actions.sendKeys("A").perform();

        actions.sendKeys(body, Keys.SHIFT).perform();
        actions.sendKeys(body, Keys.CONTROL).perform();

        driver.quit();
    }

    private void jscriptError(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/javascript_error");
        driver.quit();
    }

    private void jscriptAlerts(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click on the first alert
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // Click on the second alert
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
        alert = driver.switchTo().alert();
        alert.dismiss();

        // Click on the third alert
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
        alert = driver.switchTo().alert();
        alert.sendKeys("Hello World");
        alert.accept();

        driver.quit();
    }

    private void hovers(WebDriver driver) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement element = driver.findElement(By.xpath("//div[@class='figure'][2]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        Thread.sleep(10000);
        driver.quit();
    }

    private void horizontalSlide(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, 100, 0).perform();
        driver.quit();
    }

    private void frames(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");

        WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Your content goes here.')]"));
        if (element.isDisplayed()) {
            System.out.println("You are in the frame");
        } else {
            System.out.println("You are not in the frame");
        }
        driver.quit();
    }

    private void floatingMenu(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/floating_menu");
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Contact')]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click(element).perform();

        driver.quit();
    }

    private void fileUpload(WebDriver driver) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(2000);
        WebElement uploadElement = driver.findElement(By.xpath("//input[@id='file-upload']"));

        uploadElement.sendKeys("/Users/baba/Downloads/billie.png");
        driver.findElement(By.id("file-submit")).click();

        driver.quit();
    }

    private void fileDownload(WebDriver driver) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText("SomeFile.txt")).click();

        // check if the file exists in the download folder
        Thread.sleep(5000); // Adjust the sleep time as needed

        // Validate the download is successful -- /Users/baba
        String downloadPath = System.getProperty("user.home") + "/Downloads/SomeFile.txt";
        File file = new File(downloadPath);
        if (file.exists()) {
            System.out.println("File downloaded successfully.");
        } else {
            System.out.println("File download failed.");
        }


        driver.quit();
    }

    private void dropDown(WebDriver driver) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement dropDown1 = driver.findElement(By.id("dropdown"));

        Select select = new Select(dropDown1);
        System.out.println(select.getOptions().toString());

        select.selectByIndex(1);
        select.selectByVisibleText("Option 2");

        driver.quit();
    }

    private void dragAndDrop(WebDriver driver){
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        WebElement elementA = driver.findElement(By.id("column-a"));
        WebElement elementB = driver.findElement(By.id("column-b"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(elementA, elementB).perform();

        driver.quit();

    }

    private void digestiveAuthentication(WebDriver driver) {
        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
        if(driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).isDisplayed()){
            System.out.println("You are logged in");
        } else {
            System.out.println("You are not logged in");
        }
        driver.quit();
    }

    private void basicAuthentication(WebDriver driver) {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        if(driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credentials.')]")).isDisplayed()){
            System.out.println("You are logged in");
        } else {
            System.out.println("You are not logged in");
        }
    }

    private void actions(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement element = driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);
        actions.scrollToElement(element).perform();
        actions.contextClick(element).perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();
    }

    private void login(WebDriver driver) {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    }

    private void textBox(){

    }

    private void checkBox(WebDriver driver) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
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
