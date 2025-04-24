package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportPractice {
    private static ExtentReports sampleExtentReport;
    private static ExtentTest sampleTest1;
    private static ExtentTest sampleTest2;

    public ExtentReports extentReportConfig(String reportName, String reportPath) {
        // Initialize the SparkReporter

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath + reportName + ".html");
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle("Extent Report Sample");
        sparkReporter.config().setReportName("Sample Test Report");

        // Initialize ExtentReports and attach the SparkReporter
        sampleExtentReport = new ExtentReports();
        sampleExtentReport.attachReporter(sparkReporter);

        // Set system info
        sampleExtentReport.setSystemInfo("OS", "macOS");
        sampleExtentReport.setSystemInfo("Environment", "Local");
        sampleExtentReport.setSystemInfo("User", "Baba");

        return sampleExtentReport;
    }

    public void sampleTest() {
        // Create a test case in the report
        sampleTest1 = sampleExtentReport.createTest("Sample Test Case", "This is a sample test case");

        // Log test steps
        sampleTest1.info("Starting the test case");
        sampleTest1.pass("Test case passed");
        sampleTest1.pass("Test case passed");

        sampleTest1.warning("Test case warning");
    }

    public void sampleTest2() {
        // Create a test case in the report
        sampleTest2 = sampleExtentReport.createTest("Sample Test Case 2", "This is a sample test case 2");

        // Log test steps
        sampleTest2.info("Starting the test case");
        sampleTest2.pass("Test case passed");
        sampleTest2.fail("Test case failed");
    }

    public static void tearDown() {
        // Write the report to the file
        sampleExtentReport.flush();
    }
}
