package org.javapractice;

import org.codetemplates.DefaultExample;

public class DifferentPackageDefaultClass extends DefaultExample {
    public static void main(String[] args) {
        // You cannot access either extends or instance members of DefaultExample because they are default access
        DifferentPackageDefaultClass obj = new DifferentPackageDefaultClass();
//        System.out.println(obj.displayMessage());

        DefaultExample obj1 = new DefaultExample();
//         System.out.println(obj.message); // Error: message is not public in com.example.package1
//         obj.displayMessage(); // Error: displayMessage is not public in com.example.package1
    }
}
