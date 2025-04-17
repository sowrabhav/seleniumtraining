package org.javapractice;

import selenium.drivermanagement.AppDriver;

import java.io.File;

public class FunctionalCode {
    AppDriver appDriver = new AppDriver();

    // Java code for Arithmetic operations
    public int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        /*if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }*/
        if (a==0){
            return 0;
        }
        if (b==0){
            return -1;
        }
        return a / b;
    }

    public void readFileFromNAS(String NASLocationFile){
        System.out.println("Reading file from NAS...");

        // Code to read file from NAS
        // This is a placeholder for the actual implementation

        File nasFile = new File(NASLocationFile);
        if (!nasFile.exists()) {
            System.out.println("File not found in NAS.");
            return;
        }

        // Simulate reading the file
        // In a real-world scenario, you would use appropriate libraries to read the file

        StringBuilder fileContent = new StringBuilder();
        if (nasFile.getAbsoluteFile().exists() && nasFile.isFile()) {
            fileContent.append("Reading file from: ").append(nasFile.getAbsolutePath());
        } else {
            System.out.println("File not found in NAS.");
            return;
        }

        System.out.println("File content: " + fileContent.toString());

        appDriver.getDriver().get("file:///" + nasFile.getAbsolutePath());
        System.out.println("File opened in browser: " + nasFile.getAbsolutePath());
    }
}
