package selenium.drivermanagement;

import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.openqa.selenium.WebDriver;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppDriverTest {
    //Unit test for AppDriver Class

    private AppDriver appDriver;

    @BeforeEach
    void setUp() {
        appDriver = new AppDriver();
    }

    /*@Test
    void testInitializeChromeDriver() {
        // Mock ChromeDriver
        WebDriver mockDriver = mock(WebDriver.class);
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Spy on AppDriver and override the driver initialization
        AppDriver spyAppDriver = Mockito.spy(appDriver);
        doReturn(mockDriver).when(spyAppDriver).getDriver();

        spyAppDriver.initializeDriver(Browser.CHROME);

        assertNotNull(spyAppDriver.getDriver());
        verify(spyAppDriver, times(1)).getDriver();
    }

    @Test
    void testInitializeFirefoxDriver() {
        // Mock FirefoxDriver
        WebDriver mockDriver = mock(WebDriver.class);
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");

        // Spy on AppDriver and override the driver initialization
        AppDriver spyAppDriver = Mockito.spy(appDriver);
        doReturn(mockDriver).when(spyAppDriver).getDriver();

        spyAppDriver.initializeDriver(Browser.FIREFOX);

        assertNotNull(spyAppDriver.getDriver());
        verify(spyAppDriver, times(1)).getDriver();
    }

    @Test
    void testQuitDriver() {
        // Mock WebDriver
        WebDriver mockDriver = mock(WebDriver.class);
        appDriver.setDriver(mockDriver);

        appDriver.quitDriver();

        verify(mockDriver, times(1)).quit();
    }*/

}
