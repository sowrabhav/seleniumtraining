package org.codetemplates;

public class AccessControls {
    // Access control is a mechanism to restrict access to certain parts of the code
    // Access control is used to protect the data from unauthorized access

    // Access controls are used to restrict access to classes, methods, and variables
    // Available access controls are public, private, protected, and default

    // Public access control
    // Public access control is the most open access control
    // Public access control allows unrestricted access to the class, method, or variable
    // Public access control allows access from any class, method, or variable

    // Private access control
    // Private access control is the most restrictive access control
    // Private access control restricts access to the class, method, or variable
    // Private access control allows access only from the same class

    // Protected access control
    // Protected access control allows access to the class, method, or variable from the same package
    // Protected access control allows access to the class, method, or variable from the subclass

    // Default access control
    // Default access control allows access to the class, method, or variable from the same package
    // Default access control restricts access to the class, method, or variable from the subclass

    private int privateVariable = 10;
    public int publicVariable = 20;
    protected int protectedVariable = 30;
    int defaultVariable = 40;

    public void samplePublicMethod(String input1) {
        int i = 10;
        String val = "Hello";
        System.out.println("This is a public method");
    }

    private void samplePrivateMethod(String input1) {
        int i = 10;
        System.out.println("This is a private method");
    }

    protected void sampleProtectedMethod(String input1) {
        int i = 10;
        System.out.println("This is a protected method");
    }

    void sampleDefaultMethod(String input1) {
        System.out.println("This is a default method");
    }

    public static void main(String[] args) {
        AccessControls accessControls = new AccessControls();
        accessControls.samplePrivateMethod("input1");
        accessControls.samplePublicMethod("input1");
        accessControls.sampleProtectedMethod("input1");
        accessControls.sampleDefaultMethod("input1");

        TestAccessControls testAccessControls = new TestAccessControls();
        testAccessControls.add(10, 20);
        testAccessControls.subtract(20, 10);

        TestAccessControls1 testAccessControls1 = new TestAccessControls1();
        testAccessControls1.name = "TestAccessControls1";
        testAccessControls1.age = 30;

    }

    class TestAccessControls1 {
        String name = "TestAccessControls1";
        protected int age = 30;
    }

}

class TestAccessControls{
    public static void main(String[] args) {
        AccessControls accessControls = new AccessControls();

        accessControls.publicVariable = 100;
        accessControls.protectedVariable = 200;
        accessControls.defaultVariable = 300;
        // accessControls.privateVariable = 400;

//        accessControls.samplePrivateMethod("input1");
        accessControls.samplePublicMethod("input1");
        accessControls.sampleProtectedMethod("input1");
        accessControls.sampleDefaultMethod("input1");
    }

    int add(int a, int b){
        return a+b;
    }

    protected int subtract(int a, int b){
        return a-b;
    }
}