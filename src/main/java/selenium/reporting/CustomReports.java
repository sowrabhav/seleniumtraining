package selenium.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomReports {
    private static ExtentReports reporting;
    private static ExtentTest sampleTest1;
    private static ExtentTest sampleTest2;

    public CustomReports(String reportName, String reportPath) {
        // Initialize the SparkReporter

        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath + reportName + ".html");
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle("Extent Reports");
        sparkReporter.config().setReportName(reportName);

        // Initialize ExtentReports and attach the SparkReporter
        reporting = new ExtentReports();
        reporting.attachReporter(sparkReporter);

        // Set system info
        reporting.setSystemInfo("OS", "macOS");
        reporting.setSystemInfo("Environment", "Local");
        reporting.setSystemInfo("User", "Baba");

    }

    // getters and setters
    public static ExtentReports getReporting() {
        return reporting;
    }
}
