package org.javapractice;

//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
import org.openqa.selenium.WebDriver;
import selenium.drivermanagement.AppDriver;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.*;

public class FunctionalCodeTest {

    // JUnits for FunctionalCode class
    @Test
    public void testAdd() {
        FunctionalCode functionalCode = new FunctionalCode();
        int result = functionalCode.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = FunctionalCode.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = FunctionalCode.multiply(5, 3);
        assertEquals(15, result);
    }

    @Test
    public void testDivide() {
        int result = FunctionalCode.divide(6, 3);
        assertEquals(2, result);
    }

    @Test
    public void testDivideByZero() {
        int result = FunctionalCode.divide(6, 0);
        assertEquals(-1, result);
    }

    @Test
    public void testDivideByZeroWithZeroNumerator() {
        int result = FunctionalCode.divide(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testDivideWithZeroNumerator() {
        int result = FunctionalCode.divide(0, 3);
        assertEquals(0, result);
    }

    @Test
    public void testReadFileFromNAS() {
        FunctionalCode functionalCode = new FunctionalCode();
        String NASLocationFile = "/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/logs/selenium-2025-04-09_10-04-56.log";

        // Mock NASLocationFile
        // This is a placeholder for the actual implementation

//        Mockito.when(functionalCode.readFileFromNAS(NASLocationFile)).thenReturn("Reading file from: " + NASLocationFile);
        /*Mockito.when(new File(Mockito.anyString())).thenReturn(new File(NASLocationFile));

        AppDriver appDriver = Mockito.mock(AppDriver.class);
        WebDriver webDriver = Mockito.mock(WebDriver.class);
        Mockito.when(appDriver.getDriver()).thenReturn(Mockito.mock(org.openqa.selenium.WebDriver.class));
        doNothing().when(webDriver).get(Mockito.anyString());
*/
        // Replace with actual file path
//        functionalCode.readFileFromNAS(NASLocationFile);
    }
}
