package org.javapractice;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public interface InterfaceAndAbstractExamples {

    public Boolean isDriverInstantiated();

    public String driverName();

    public String driverType();

    public int noOfInstances();

}

interface input{
    public String value(String inputValue);
    public String name(String inputName);

}

class Button1 implements  input{

    @Override
    public String value(String inputValue) {
        return inputValue;
    }

    @Override
    public String name(String inputName) {
        return inputName;
    }

    public String role(String roleType){
        return roleType;
    }

    public String type(String type){
        return type;
    }
}

class GooglePage{
    public static void main(String[] args) {
        Button1 googleSearch = new Button1();
        Button1 ImFeelingLucky = new Button1();

        googleSearch.value("Google Search");
        googleSearch.name("btnk");
        googleSearch.role("button");
        googleSearch.type("submit");
    }
}



interface Page{

    public String pageName();
    public List<WebElement> pageElements();
    public String pageStatus();
    public int noOfElements();

}

// Google home page -- Saurabha

class GoogleHome implements Page{

    @Override
    public String pageName() {
        return "Google Home Page";
    }

    @Override
    public List<WebElement> pageElements() {
        List<WebElement> elements = new ArrayList<>();
        return elements;
    }

    @Override
    public String pageStatus() {
        return "Active";
    }

    @Override
    public int noOfElements() {
        return 20;
    }

}


// Google login page - Team2
abstract class OurOwnDriver {

    public String driverName() {
        return "OperaDriver";
    }

    abstract String driverStatus();
    abstract int multipleInstancesCanHandle();
}

class OperaDriver extends OurOwnDriver{

    public static void main(String[] args) {
        OurOwnDriver operaDriver = new OurOwnDriver() {
            @Override
            String driverStatus() {
                return "";
            }

            @Override
            int multipleInstancesCanHandle() {
                return 0;
            }
        };
    }

    @Override
    String driverStatus() {
        return "";
    }

    @Override
    int multipleInstancesCanHandle() {
        return 0;
    }

}
