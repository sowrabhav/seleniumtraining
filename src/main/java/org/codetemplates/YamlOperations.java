package org.codetemplates;

import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class YamlOperations {
    /*public static void main(String[] args) {
        Constructor constructor = new Constructor(TestDataWrapper.class);
        TypeDescription testDataWrapperDescription = new TypeDescription(TestDataWrapper.class);
        testDataWrapperDescription.addPropertyParameters("testData", TestData.class);
        constructor.addTypeDescription(testDataWrapperDescription);
        // File for yaml file reading

        Yaml yaml = new Yaml(constructor);
        try (InputStream inputStream = YamlOperations.class.getClassLoader().getResourceAsStream("TestData.yaml")) {
            TestDataWrapper data = yaml.load(inputStream);
            for (TestData testData : data.getTestData()) {
                System.out.println("Username: " + testData.getUsername());
                System.out.println("Password: " + testData.getPassword());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}

/*lass TestDataWrapper {
    private List<TestData> testData;

    public List<TestData> getTestData() {
        return testData;
    }

    public void setTestData(List<TestData> testData) {
        this.testData = testData;
    }
}

class TestData {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}*/
