package selenium.pageobjectrepository;

import ch.qos.logback.classic.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products_Page {
    final Logger logger = (Logger) org.slf4j.LoggerFactory.getLogger(Products_Page.class);

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    private WebElement addToCartBackpackButton;

    @FindBy(xpath="//select[@class='product_sort_container']")
    private WebElement sortDropdown;

    @FindBy(xpath="//span[text()='Products']")
    private WebElement productsPageTitle;

    public Products_Page (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getProductsPageTitle() {
        return productsPageTitle;
    }

    public boolean validateProductsPageTitle() {
        if (getProductsPageTitle().isDisplayed()) {
            logger.info("Products page title is displayed");
            return true;
        } else {
            logger.info("Products page title is not displayed");
            return false;
        }
    }


    public WebElement getAddToCartBackpackButton() {
        return addToCartBackpackButton;
    }

    public WebElement getSortDropdown() {
        return sortDropdown;
    }

    public void clickAddToCartBackpackButton() {
        addToCartBackpackButton.click();
    }

    public void selectSortOption(String option) {
        sortDropdown.sendKeys(option);
    }

}
