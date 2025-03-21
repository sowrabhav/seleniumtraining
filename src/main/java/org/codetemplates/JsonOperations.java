package org.codetemplates;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonOperations {
    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("TestData.json")));
            JSONObject jsonObject = new JSONObject(content);
            JSONArray testDataArray = jsonObject.getJSONArray("testData");

            for (int i = 0; i < testDataArray.length(); i++) {
                JSONObject testData = testDataArray.getJSONObject(i);
                String username = testData.getString("username");
                String password = testData.getString("password");

                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
