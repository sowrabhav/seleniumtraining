package org.codetemplates;

public class Methods {
    // Method is a block of code that performs a specific task
    // Method contains a set of instructions
    // Method is used to perform a specific task
    // Method is used to define the behavior of an object
    // Method is used to define the behavior of a class

    // Method is a collection of statements that are grouped together to perform an operation
    // Method accepts input in the form of parameters
    // Method returns output in the form of a return value

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isPrime(int number, int iii) {
        if (number <= 1) {
            return false;
        }

        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }


}
