package org.codetemplates;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;

@Slf4j
public class Exceptions {

    // Exceptions are used to handle errors and other exceptional events in Java programs.
    // They are objects that represent an error or an unexpected condition that occurs during the execution of a program.
    // When an exception occurs, the normal flow of the program is disrupted, and the program may terminate or take alternative actions to handle the error.
    // Java provides a robust exception handling mechanism that allows developers to catch and handle exceptions gracefully.

    // The main components of exception handling in Java are:
    // 1. try block: This block contains the code that may throw an exception. If an exception occurs within this block, the control is transferred to the corresponding catch block.
    // 2. catch block: This block is used to handle the exception thrown by the try block. It contains code that specifies what to do when a specific type of exception occurs.
    // 3. finally block: This block is optional and contains code that will always execute, regardless of whether an exception occurred or not. It is typically used for cleanup operations, such as closing resources.
    // 4. throw statement: This statement is used to explicitly throw an exception. It can be used to indicate that an error condition has occurred.
    // 5. throws clause: This clause is used in method declarations to specify that a method may throw one or more exceptions. It informs the caller of the method about the potential exceptions that may occur.
    // 6. Exception hierarchy: Java has a built-in hierarchy of exception classes, with the base class being java.lang.Exception. There are two main types of exceptions: checked exceptions (which must be handled or declared) and unchecked exceptions (which do not require explicit handling).
    // 7. Custom exceptions: Developers can create their own exception classes by extending the Exception class or its subclasses. This allows for more specific error handling and better organization of exception-related code.
    // 8. Exception propagation: When an exception occurs, it can propagate up the call stack until it is caught by a suitable catch block. If not caught, the program may terminate with an error message.
    // 9. Exception handling best practices: It is important to handle exceptions appropriately, log error messages, provide meaningful feedback to users, and avoid using exceptions for control flow.
    // 10. Exception handling in multi-threaded applications: In multi-threaded applications, exceptions can occur in different threads. It is important to handle exceptions in each thread separately and ensure that the main thread can continue executing without being affected by exceptions in other threads.
    // 11. Exception handling in Java 7 and later: Java 7 introduced the try-with-resources statement, which simplifies resource management by automatically closing resources that implement the AutoCloseable interface. This reduces the need for explicit finally blocks for resource cleanup.
    // 12. Exception handling in Java 8 and later: Java 8 introduced the Optional class, which can be used to handle cases where a value may or may not be present, reducing the need for null checks and associated exceptions.
    // 13. Exception handling in Java 9 and later: Java 9 introduced the try-with-resources statement with multiple resources, allowing multiple resources to be declared in a single try statement. This simplifies resource management further.
    // 14. Exception handling in Java 11 and later: Java 11 introduced the new HttpClient API, which provides better exception handling for HTTP requests and responses. It also introduced the var keyword for local variable type inference, making it easier to work with exceptions without explicitly specifying types.
    // 15. Exception handling in Java 12 and later: Java 12 introduced the switch expression, which allows for more concise and expressive exception handling in switch statements. It also introduced the new NullPointerException.getMessage() method, which provides a more informative error message when a NullPointerException occurs.
    // 16. Exception handling in Java 13 and later: Java 13 introduced the new text blocks feature, which allows for multi-line string literals. This can simplify exception messages and improve readability.
    // 17. Exception handling in Java 14 and later: Java 14 introduced the new instanceof pattern matching feature, which simplifies type checking and casting in exception handling code. It allows for more concise and readable exception handling logic.
    // 18. Exception handling in Java 15 and later: Java 15 introduced the new sealed classes feature, which allows developers to define a restricted set of subclasses for a class. This can be useful for creating custom exception hierarchies with controlled inheritance.
    // 19. Exception handling in Java 16 and later: Java 16 introduced the new record classes feature, which allows for concise data classes. This can be useful for creating custom exception classes with immutable fields and automatic implementations of equals(), hashCode(), and toString() methods.
    // 20. Exception handling in Java 17 and later: Java 17 introduced the new pattern matching for switch statements feature, which allows for more expressive and concise exception handling in switch statements. It also introduced the new sealed interfaces feature, which allows developers to define a restricted set of implementing classes for an interface.
    // 21. Exception handling in Java 18 and later: Java 18 introduced the new foreign function and memory API, which allows for better exception handling when working with native code and memory management. It also introduced the new vector API, which provides better performance and exception handling for vector operations.
    // 22. Exception handling in Java 19 and later: Java 19 introduced the new virtual threads feature, which allows for better exception handling in concurrent applications. It also introduced the new structured concurrency feature, which simplifies exception handling in multi-threaded applications by providing a more structured approach to managing threads and exceptions.
    // 23. Exception handling in Java 20 and later: Java 20 introduced the new pattern matching for instance of feature, which simplifies type checking and casting in exception handling code. It also introduced the new record patterns feature, which allows for more concise and expressive exception handling with record classes.
    // 24. Exception handling in Java 21 and later: Java 21 introduced the new sealed interfaces feature, which allows developers to define a restricted set of implementing classes for an interface. This can be useful for creating custom exception hierarchies with controlled inheritance.

    public static void main(String[] args) {
        Exceptions exceptions = new Exceptions();
        exceptions.uncheckedExceptionExample();
    }

    // Example for checked exception
    public void checkedExceptionExample() {
        try {
            // Code that may throw a checked exception
            // For example, trying to read a file that does not exist
            File file = new File("nonexistent.txt");
            throw new IOException("Checked exception occurred");
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
    }

    // Example for unchecked exception
    public void uncheckedExceptionExample() {

        File file = new File("nonexistent.txt");
        try {
            // Code that may throw an unchecked exception
            int result = 10 / 0; // Division by zero
            System.out.println(result);
            if (!file.exists()) {
                throw new IOException("File not found: " + file.getAbsolutePath());
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
            Assertions.assertTrue(false);
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
            System.exit(1);
            Assertions.assertTrue(false);
        } catch (Exception e){
            System.out.println("Caught general exception: " + e.getMessage());
        } finally {
            file.delete();
            System.out.println("Finally block executed");
        }

        System.out.println("Unchecked exception test completed.");
    }

    ExceptionTest1 exceptionTest1 = new ExceptionTest1();

    public void testCheckedException() {
        try {
            exceptionTest1.checkedException();
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
            System.out.println("Breaking the code");
            Assertions.assertTrue(false);
        }

        System.out.println("Checked exception test completed.");
    }
}

class ExceptionTest1{
    public void checkedException() throws IOException {
        File file = new File("nonexistent.txt");
        if (!file.exists()) {
            throw new IOException("File not found: " + file.getAbsolutePath());
        }
        file.isDirectory();
    }
}

// Create a custom exception class
class AutomationException extends Exception {
    public AutomationException(String message) {
        super(message);
    }
}