package org.codetemplates;

public class SamePackageProtectedClass {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        System.out.println(obj.message); // Accessible
        obj.displayMessage(); // Accessible
    }
}
