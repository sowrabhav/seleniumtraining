package objectsandactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriverUtils;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebTablePractice extends DriverUtils {
    // Table tags (table, thead, tbody, tr, th, td)
    // Working on WebTables
    // 1. Locate the webtable (based on id, name, xpath, cssSelector)
    // 2. Get the number of rows in the table
    // 3. Get the number of columns in the table
    // 4. Get the text of the cell in the table
    // 5. Get the text of the cell in the table based on row and column number
    // 6. Get the text of the cell in the table based on row and header name
    // 7. Get the text of the cell in table by other cell value
    // 8. Perform actions on the cell in the table
    // 9. Sort the table based on the column
    // 10. Read all the data from the table
    // 11. Read all the data from the table based on the column
    // 12. Read all the data from the table based on the row

    static WebDriver driver;
    static WebElement table;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        table = driver.findElement(By.xpath("//table"));
        // Read a cell of table body based on row and column number (3rd row, 4th column)
//        WebElement row3Column4 = getCell(table, 3, 4);

        /*// Get the Header values from the table (table
        List<WebElement> headers = readAllHeaders(table);

        // print headers
        for (WebElement header : headers) {
            System.out.println(header.getText());
        }*/

        /*// Get all row data from the table (table, row number)
        List<WebElement> row1Data = readRowData(table, 1);

        // print row data
        for (WebElement data : row1Data) {
            System.out.println(data.getText());
        }*/

        /*// Get all column data from the table (table, column number)
        List<WebElement> column1Data = readColumnData(table, 1);

        // print column data
        for (WebElement data : column1Data) {
            System.out.println(data.getText());
        }*/

        // Get all data from table
        Map<String, List<WebElement>> allData = readAllData(table);

        // print all data
        for (Map.Entry<String, List<WebElement>> entry : allData.entrySet()) {
            System.out.println(entry.getKey());
            for (WebElement data : entry.getValue()) {
                System.out.println(data.getText());
            }
        }

//        table = driver.findElement(By.xpath("//table[@id='table1']"));
//        DriverUtils.highlightElement(driver, table);
//
//        // get row count of the table
//        System.out.println("Row count: " + getRowCount(table));

        driver.quit();
    }

    public static int getRowCount(WebElement table) {
        return table.findElements(By.xpath("//tbody/tr")).size();
    }

    public static int getColumnCount(WebElement table) {
        table.findElements(By.xpath("//tr/th"));
        return 0;
    }

    public static WebElement getCell(WebElement table, int row, int column) {
        return table.findElement(By.xpath("//tr[" + row + "]/td[" + column + "]"));
    }

    public static String getCellData(WebElement table, int row, String header) {
        table.findElement(By.xpath("//tr[" + row + "]/td[.='" + header + "']"));
        return "";
    }

    public static String getCellData(WebElement table, String cellValue) {
        table.findElement(By.xpath("//td[.='" + cellValue + "']"));
        return "";
    }

    public static void performClickAction(WebElement table, int row, int column, String action) {
        table.findElement(By.xpath("//tr[" + row + "]/td[" + column + "]")).click();
    }

    public static void sortTable(WebElement table, int column) {
        table.findElement(By.xpath("//tr/th[" + column + "]")).click();
    }

    public static Map<String, List<WebElement>> readAllData(WebElement table) {
        Map<String, List<WebElement>> columnData = new HashMap<>();
        List<WebElement> headers = readAllHeaders(table);
        List<WebElement> allRowColumnVals;

        for (int i=1; i<=headers.size(); i++) {
            allRowColumnVals = table.findElements(By.xpath("//tr/td[" + i + "]"));
            columnData.put(headers.get(i-1).getText(), allRowColumnVals);
        }

        return columnData;
    }

    public static void readAllColumnData(WebElement table, int column) {
        table.findElements(By.xpath("//tr/td[" + column + "]"));
    }

    public static void readAllRowData(WebElement table, int row) {
        table.findElements(By.xpath("//tr[" + row + "]/td"));
    }

    public static void readAllRowData(WebElement table, String header) {
        table.findElements(By.xpath("//tr/td[.='" + header + "']"));
    }

    public static void readAllRowData(WebElement table, String header, int row) {
        table.findElements(By.xpath("//tr[" + row + "]/td[.='" + header + "']"));
    }

    public static void readAllColumnData(WebElement table, String header) {
        table.findElements(By.xpath("//tr/td[.='" + header + "']"));
    }

    public static void readAllColumnData(WebElement table, String header, int column) {
        table.findElements(By.xpath("//tr/td[" + column + "][.='" + header + "']"));
    }

    public static List<WebElement> readAllHeaders(WebElement table) {
        if (table.findElements(By.xpath("//thead")).isEmpty()) {
            return table.findElement(By.xpath("//tr")).findElements(By.tagName("td"));
        }else{
            return table.findElement(By.xpath("//tr")).findElements(By.tagName("th"));
        }
    }

    public static List<WebElement> readRowData(WebElement table, int rowNumber){
        return table.findElement(By.xpath("//tbody/tr[" + rowNumber + "]")).findElements(By.tagName("td"));
    }

    public static List<WebElement> readColumnData(WebElement table, int columnNumber){
        return table.findElements(By.xpath("//tbody/tr/td[" + columnNumber + "]"));
    }

}
