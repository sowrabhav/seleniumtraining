package org.javapractice;

import org.codetemplates.ProtectedExample;

public class SubclassInDifferentPackage extends ProtectedExample {
    public static void main(String[] args) {
        SubclassInDifferentPackage obj = new SubclassInDifferentPackage();
        System.out.println(obj.message); // Accessible
        obj.displayMessage(); // Accessible
    }
}

class NonSubclassInDifferentPackage {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
//         System.out.println(obj.message); // Error: message has protected access in com.example.package1
        // obj.displayMessage(); // Error: displayMessage has protected access in com.example.package1
    }
}
