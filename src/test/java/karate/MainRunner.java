package karate;

import com.intuit.karate.Runner;

public class MainRunner {
    public static void main(String[] args) {
        // This is the main method where you can run your Karate tests
        // You can use the Karate command line or a test runner to execute the tests
        // For example, you can use Maven or Gradle to run the tests
        System.out.println("Running Karate tests...");
        Runner.path("src/test/java/karate").parallel(1);
    }
}
