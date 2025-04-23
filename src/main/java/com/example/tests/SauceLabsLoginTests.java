package com.example.tests;

import org.testng.annotations.*;

public class SauceLabsLoginTests {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @Test(groups = {"smoke"})
    public void testSmoke() {
        System.out.println("Executing Smoke Test");
    }

    @Test(groups = {"regression"})
    public void testRegression() {
        System.out.println("Executing Smoke Test");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        System.out.println("after Suite");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest() {
        System.out.println("after Test");
    }

    @AfterSuite(alwaysRun = true)
    public void afterClass() {
        System.out.println("after Class");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("after Method");
    }
}
