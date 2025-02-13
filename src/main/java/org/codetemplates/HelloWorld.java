package org.codetemplates;


// Every Java file should have a class with the same name as the file
// The class with the main method is the entry point of the program
// The main method is the starting point of the program
// The main method is the first method to be executed
// The main method is the first method to be executed when the program is run

// Class is a blueprint for objects
// Class is a template for objects
// Class name should start with an upper case letter
// Class name should be a noun
// Class name and file name should be the same
// Class name should be meaningful

// Every Java program should have at least one class
// Every Java program should have at least one main method


public class HelloWorld {
    public static void main(String[] args) {
        // Using args to pass arguments to the program
        switch (args[0]){
            case "Chrome":
                System.out.println("Our program started with Chrome");
                break;
            case "Firefox":
                System.out.println("Our program started with Firefox");
                /*System.setProperty("webdriver.gecko.driver", "/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/main/resources/drivers/geckodriver");
                WebDriver driver = new FirefoxDriver();
                driver.quit();*/
                break;
            case "Safari":
                System.out.println("Our program started with Safari");
                break;
            default:
                System.out.println("Our program started with Selenium");
        }

        System.out.println("Hello World!");
        System.out.println(audiCar());
    }

    // Creating object from a class is called instantiation
    // Object is an instance of a class
    // Object is a real world entity
    // Object is a runtime entity
    // Object is a reference to a memory location where the data and methods of a class are stored
    public static Vehicle audiCar(){
        // Creating an object of the Vehicle class
        Vehicle car = new Vehicle();
        car.name = "Audi";
        car.color = "Black";
        car.model = "A4";
        car.brand = "Audi";
        car.type = "Sedan";
        car.price = 50000;

        System.out.println("Car details: " + car);
        return car;
    }
}

/**
 packages in small characters
 classes in camel casing starting with upper case
 methods in camel casing starting with lower case
 variables in camel casing starting with lower case
 constants in all capital letters with underscores
*/

/*
Things -->
LivingThings -->
NonMovingLivingThings -->
Plants -->  TomatoPlant
Trees --> CoconutTree
MovableLivingThings -->
Animals -->
Insects --> Butterfly
Fish --> Shark
Birds --> Eagle
Mammals --> Human
Human --> Male or Female
Male --> American, Indian, Chinese

--> Non_LivingThings -->
Vehicle --> Car
Furniture --> Chair*/

class Vehicle{
    String name;
    String color;
    String model;
    String brand;
    String type;
    int price;

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

