package org.automation;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpRequestByApache {

    public static void main(String[] args) {
        // Create an instance of HttpClient
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            // Define the GET request
            HttpGet request = new HttpGet("https://jsonplaceholder.typicode.com/users");

            // Execute the request
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                // Get the response entity
                HttpEntity entity = response.getEntity();

                // Print the response status
                System.out.println("Response Status: " + response.getStatusLine());

                // Convert the response entity to a string and print it
                if (entity != null) {
                    String result = EntityUtils.toString(entity);
                    System.out.println("Response Body: " + result);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
