package org.codetemplates;

public class Loops {

    public static void main(String[] args) {

        // Looping statements are used to execute a block of code repeatedly
        // Looping statements are used to execute a block of code repeatedly based on a condition
        // Looping statements are used to execute a block of code repeatedly based on a condition being true or false
        // Looping statements are used to execute a block of code repeatedly based on a condition being true
        // Looping statements are used to execute a block of code repeatedly based on a condition being false

        // Looping statements example
        int number24 = 10;

        // Looping statements
        for (int i = 0; i < number24; i++) {
            System.out.println("The number is " + i);
        }

        // when do we use for loop?
        // When we know the number of iterations
        // When we know the number of iterations based on a condition
        // When we know the number of iterations based on a condition being true
        // When we know the number of iterations based on a condition being false
        // Based on next loop iteration (ex: jump 2 iterations)

        // While loop
        // While loop is used to execute a block of code repeatedly based on a condition
        // While loop is used to execute a block of code repeatedly based on a condition being true
        // While loop is used to execute a block of code repeatedly based on a condition being false

        // While loop example
        int number25 = 10;
        int i = 0;

        // While loop
        while (i < number25) {
            System.out.println("The number is " + i);
            i++;
        }

        // Do-while loop
        // Do-while loop is used to execute a block of code repeatedly based on a condition
        // Do-while loop is used to execute a block of code repeatedly based on a condition being true
        // Do-while loop is used to execute a block of code repeatedly based on a condition being false

        // Do-while loop example

        int number26 = 10;
        int j = 0;

        // Do-while loop
        do {
            System.out.println("The number is " + j);
            j++;
        } while (j < number26);

        // For loop
        // For loop is used to execute a block of code repeatedly based on a condition
        // For loop is used to execute a block of code repeatedly based on a condition being true
        // For loop is used to execute a block of code repeatedly based on a condition being false

        // For loop example
        int number27 = 10;

        // For loop
        for (int k = 0; k < number27; k++) {
            System.out.println("The number is " + k);
        }

        // Enhanced for loop
        // Enhanced for loop is used to iterate over an array or a collection
        // Enhanced for loop is used to iterate over an array or a collection

        // Enhanced for loop example
        int[] numbers = {1, 2, 3, 4, 5};

        // Enhanced for loop
        for (int no : numbers) {
            System.out.println("The number is " + no);
        }

        // Break statement
        // Break statement is used to exit a loop or a switch statement
        // Break statement is used to exit a loop or a switch statement based on a condition
        // Break statement is used to exit a loop or a switch statement based on a condition being true
        // Break statement is used to exit a loop or a switch statement based on a condition being false

        // Break statement example
        int number29 = 10;

        // Break statement
        for (int l = 0; l < number29; l++) {
            if (l == 5) {
                break;
            }
            System.out.println("The number is " + l);
        }

        // Continue statement
        // Continue statement is used to skip the current iteration of a loop
        // Continue statement is used to skip the current iteration of a loop based on a condition
        // Continue statement is used to skip the current iteration of a loop based on a condition being true
        // Continue statement is used to skip the current iteration of a loop based on a condition being false

        // Continue statement example
        int number30 = 10;

        // Continue statement
        for (int m = 0; m < number30; m++) {
            if (m == 5) {
                continue;
            }
            System.out.println("The number is " + m);
        }

        // Return statement
        // Return statement is used to return a value from a method
        // Return statement is used to return a value from a method based on a condition
        // Return statement is used to return a value from a method based on a condition being true
        // Return statement is used to return a value from a method based on a condition being false

        // Return statement example
        int number31 = 10;

        // Return statement
        if (number31 > 0) {
            return;
        }

        // Jump statements
        // Jump statements are used to transfer control to another part of the program
        // Jump statements are used to transfer control to another part of the program based on a condition
        // Jump statements are used to transfer control to another part of the program based on a condition being true or false
        // Jump statements are used to transfer control to another part of the program based on a condition being true
        // Jump statements are used to transfer control to another part of the program based on a condition being false

        // Control flow statements
        // Control flow statements are used to control the flow of execution in a program
        // Control flow statements are used to control the flow of execution in a program based on a condition
        // Control flow statements are used to control the flow of execution in a program based on a condition being true or false
        // Control flow statements are used to control the flow of execution in a program based on a condition being true
        // Control flow statements are used to control the flow of execution in a program based on a condition being false

        // Control flow statements example
        int number33 = 10;

        // Control flow statements
        if (number33 > 0) {
            return;
        }

        // Conditional expressions
        // Conditional expressions are used to evaluate a condition and return a value based on the condition
        // Conditional expressions are used to evaluate a condition and return a value based on the condition being true or false
        // Conditional expressions are used to evaluate a condition and return a value based on the condition being true
        // Conditional expressions are used to evaluate a condition and return a value based on the condition being false

        // Conditional expressions example
        int number34 = 10;
        String result6 = (number34 > 0) ? "Positive" : "Negative";

        // Conditional operators
        // Conditional operators are used to combine multiple conditions
        // Conditional operators are used to combine multiple conditions using && and ||
        // Conditional operators are used to combine multiple conditions using &&
        // Conditional operators are used to combine multiple conditions using ||
        // Conditional operators are used to combine multiple conditions using !

        // Conditional operators example
        int number35 = 10;

        // Conditional operators
        if (number35 > 0 && number35 % 2 == 0) {
            System.out.println("The number is positive and even.");
        }

    }
}
