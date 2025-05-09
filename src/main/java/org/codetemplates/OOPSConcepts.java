package org.codetemplates;

public class OOPSConcepts {

    public static void main(String[] args) {
        // Inheritance
        // Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.
        // The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.
        // When you inherit from an existing class, you can reuse methods and fields of the parent class.
        // Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

        // Encapsulation
        // Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
        // Encapsulation is used to hide the values or state of a structured data object inside a class, preventing
        // unauthorized parties' direct access to them.
        // Encapsulation is a technique used to protect the data in an object from being modified by external entities.
        // Encapsulation is used to restrict access to the data in an object and only allow access through the object's methods.
        // Encapsulation is used to hide the implementation details of an object and only expose the necessary information to the outside world.

        class encap1{
            int a;
            private int b;
        }

        class Encap2{
            private int a;
            private int b;

            Encap2(int val1, int val2){
                this.a = val1;
                this.b = val2;
            }

            public int getA() {
                a += 10;
                return a;
            }

            public int getB() {
                return b;
            }
        }

        class A {

            public static void main(String[] args) {
                Encap2 encaps2 = new Encap2(10, 20);
                encaps2.getA();
                encaps2.getB();
            }

            Encap2 encap2_1 = new Encap2(100, 200);

        }

        // Polymorphism
        // Polymorphism is a feature of object-oriented programming that allows objects to be treated as instances of their parent class.
        // Polymorphism allows you to define methods in a parent class that can be overridden by child classes.
        // Polymorphism allows you to define methods in a parent class that can be implemented differently by child classes.
        // Polymorphism allows you to define methods in a parent class that can be called with objects of child classes.
        // Polymorphism allows you to define methods in a parent class that can be called with objects of different classes.

        // Abstraction
        // Abstraction is a mechanism of hiding the implementation details of a class and only exposing the necessary information to the outside world.
        // Abstraction is used to define the behavior of an object without revealing the details of how it is implemented.
        // Abstraction is used to define the interface of an object without revealing the implementation details.
        // Abstraction is used to define the properties and methods of an object without revealing the internal details of how they work.
        // Abstraction is used to define the behavior of an object without revealing the details of how it is implemented.


        // Interface
        // Interface is 100% abstract class
    }


}
