package org.codetemplates;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TxtDataReader {

    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/main/resources/testdata/TestData.txt"));
            for (String line : lines) {
                String[] parts = line.split("\\|");
                String username = parts[0];
                String password = parts[1];

                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
