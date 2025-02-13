package org.javapractice;

public class Conditions {

    public static void main(String[] args) {

        // Conditions are used to make decisions in a program

        // Conditions are used to execute a block of code based on a condition
        // Conditions are used to execute a block of code based on a condition being true or false


        // If statement
        // If statement is used to execute a block of code if a condition is true
        // If statement is used to execute a block of code based on a condition
        // If statement is used to execute a block of code based on a condition being true or false
        // If statement is used to execute a block of code based on a condition being true
        // If statement is used to execute a block of code based on a condition being false

        // If statement example
        int number = 10;

        // If statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // If-else statement
        // If-else statement is used to execute a block of code if a condition is true
        // If-else statement is used to execute a block of code if a condition is false
        // If-else statement is used to execute a block of code based on a condition
        // If-else statement is used to execute a block of code based on a condition being true or false
        // If-else statement is used to execute a block of code based on a condition being true
        // If-else statement is used to execute a block of code based on a condition being false

        // If-else statement example
        int number1 = 10;

        // If-else statement
        if (number1 > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        // If-else-if statement
        // If-else-if statement is used to execute a block of code if a condition is true
        // If-else-if statement is used to execute a block of code if a condition is false
        // If-else-if statement is used to execute a block of code based on a condition
        // If-else-if statement is used to execute a block of code based on a condition being true or false
        // If-else-if statement is used to execute a block of code based on a condition being true
        // If-else-if statement is used to execute a block of code based on a condition being false

        // If-else-if statement example
        int number2 = 10;

        // If-else-if statement
        if (number2 > 0) {
            System.out.println("The number is positive.");
        } else if (number2 < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch statement
        // Switch statement is used to execute a block of code based on a condition
        // Switch statement is used to execute a block of code based on a condition being true or false
        // Switch statement is used to execute a block of code based on a condition being true
        // Switch statement is used to execute a block of code based on a condition being false
        // Switch statement is used to execute a block of code based on a condition being true
        // Switch statement is used to execute a block of code based on a condition being false

        // Switch statement example
        int day = 4;
        String dayName;

        // Switch statement
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        // Ternary operator
        // Ternary operator is used to assign a value to a variable based on a condition
        // Ternary operator is used to assign a value to a variable based on a condition being true or false
        // Ternary operator is used to assign a value to a variable based on a condition being true
        // Ternary operator is used to assign a value to a variable based on a condition being false

        // Ternary operator example
        int number3 = 10;
        String result = (number3 % 2 == 0) ? "Even" : "Odd";


        // Nested if statement
        // Nested if statement is used to execute a block of code based on a condition
        // Nested if statement is used to execute a block of code based on a condition being true or false
        // Nested if statement is used to execute a block of code based on a condition being true
        // Nested if statement is used to execute a block of code based on a condition being false

        // Nested if statement example
        int number4 = 10;

        // Nested if statement
        if (number4 > 0) {
            if (number4 % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else {
            System.out.println("The number is negative.");
        }

        // Nested if-else statement
        // Nested if-else statement is used to execute a block of code based on a condition
        // Nested if-else statement is used to execute a block of code based on a condition being true or false
        // Nested if-else statement is used to execute a block of code based on a condition being true
        // Nested if-else statement is used to execute a block of code based on a condition being false

        // Nested if-else statement example
        int number5 = 10;

        // Nested if-else statement
        if (number5 > 0) {
            if (number5 % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else {
            System.out.println("The number is negative.");
        }

        // Nested if-else-if statement
        // Nested if-else-if statement is used to execute a block of code based on a condition
        // Nested if-else-if statement is used to execute a block of code based on a condition being true or false
        // Nested if-else-if statement is used to execute a block of code based on a condition being true
        // Nested if-else-if statement is used to execute a block of code based on a condition being false

        // Nested if-else-if statement example
        int number6 = 10;

        // Nested if-else-if statement
        if (number6 > 0) {
            if (number6 % 2 == 0) {
                System.out.println("The number is positive and even.");
            } else {
                System.out.println("The number is positive and odd.");
            }
        } else if (number6 < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Nested switch statement
        // Nested switch statement is used to execute a block of code based on a condition
        // Nested switch statement is used to execute a block of code based on a condition being true or false
        // Nested switch statement is used to execute a block of code based on a condition being true
        // Nested switch statement is used to execute a block of code based on a condition being false

        // Nested switch statement example
        int day1 = 4;
        String dayName1;

        int month = 2;
        String monthName;

        // Nested switch statement
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                switch (day1) {
                    case 1:
                        dayName1 = "Monday";
                        break;
                    case 2:
                        dayName1 = "Tuesday";
                        break;
                    case 3:
                        dayName1 = "Wednesday";
                        break;
                    case 4:
                        dayName1 = "Thursday";
                        break;
                    case 5:
                        dayName1 = "Friday";
                        break;
                    case 6:
                        dayName1 = "Saturday";
                        break;
                    case 7:
                        dayName1 = "Sunday";
                        break;
                    default:
                        dayName1 = "Invalid day";
                        break;
                }
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month";
                break;
        }


        // Nested ternary operator
        // Nested ternary operator is used to assign a value to a variable based on a condition
        // Nested ternary operator is used to assign a value to a variable based on a condition being true or false
        // Nested ternary operator is used to assign a value to a variable based on a condition being true
        // Nested ternary operator is used to assign a value to a variable based on a condition being false

        // Nested ternary operator example
        int number7 = 10;
        String result1 = (number7 % 2 == 0) ? "Even" : (number7 > 0) ? "Positive" : "Negative";

        // Logical operators
        // Logical operators are used to combine multiple conditions
        // Logical operators are used to combine multiple conditions using AND, OR, and NOT
        // Logical operators are used to combine multiple conditions using AND
        // Logical operators are used to combine multiple conditions using OR
        // Logical operators are used to combine multiple conditions using NOT

        // AND operator
        // AND operator is used to combine two conditions
        // AND operator is used to combine two conditions using &&

        // AND operator example
        int number8 = 10;

        // AND operator
        if (number8 > 0 && number8 % 2 == 0) {
            System.out.println("The number is positive and even.");
        }

        // OR operator
        // OR operator is used to combine two conditions
        // OR operator is used to combine two conditions using ||

        // OR operator example
        int number9 = 10;

        // OR operator
        if (number9 > 0 || number9 % 2 == 0) {
            System.out.println("The number is positive or even.");
        }

        // NOT operator
        // NOT operator is used to negate a condition
        // NOT operator is used to negate a condition using !

        // NOT operator example
        int number10 = 10;

        // NOT operator
        if (!(number10 > 0)) {
            System.out.println("The number is negative.");
        }

        // Relational operators
        // Relational operators are used to compare two values
        // Relational operators are used to compare two values using ==, !=, >, <, >=, and <=
        // Relational operators are used to compare two values using ==
        // Relational operators are used to compare two values using !=
        // Relational operators are used to compare two values using >
        // Relational operators are used to compare two values using <
        // Relational operators are used to compare two values using >=
        // Relational operators are used to compare two values using <=

        // Relational operators example
        int number11 = 10;

        // Relational operators
        if (number11 == 10) {
            System.out.println("The number is equal to 10.");
        }

        // Equality operators
        // Equality operators are used to compare two values for equality
        // Equality operators are used to compare two values for equality using == and !=
        // Equality operators are used to compare two values for equality using ==
        // Equality operators are used to compare two values for equality using !=

        // Equality operators example
        int number12 = 10;

        // Equality operators
        if (number12 != 0) {
            System.out.println("The number is not equal to 0.");
        }

        // Conditional operators
        // Conditional operators are used to combine multiple conditions
        // Conditional operators are used to combine multiple conditions using && and ||
        // Conditional operators are used to combine multiple conditions using &&
        // Conditional operators are used to combine multiple conditions using ||

        // Conditional operators example
        int number13 = 10;

        // Conditional operators
        if (number13 > 0 && number13 % 2 == 0) {
            System.out.println("The number is positive and even.");
        }

        // Bitwise operators
        // Bitwise operators are used to perform bitwise operations on integers
        // Bitwise operators are used to perform bitwise operations on integers using &, |, ^, ~, <<, and >>
        // Bitwise operators are used to perform bitwise operations on integers using &
        // Bitwise operators are used to perform bitwise operations on integers using |
        // Bitwise operators are used to perform bitwise operations on integers using ^
        // Bitwise operators are used to perform bitwise operations on integers using ~
        // Bitwise operators are used to perform bitwise operations on integers using <<
        // Bitwise operators are used to perform bitwise operations on integers using >>

        // Bitwise operators example
        int number14 = 10;

        // Bitwise operators
        if ((number14 & 1) == 0) {
            System.out.println("The number is even.");
        }

        // | operator example
        int number15 = 10;

        // | operator
        if ((number15 | 1) == 1) {
            System.out.println("The number is odd.");
        }

        // ^ operator example
        int number16 = 10;

        // ^ operator
        if ((number16 ^ 1) == 11) {
            System.out.println("The number is odd.");
        }

        // ~ operator example
        int number17 = 10;

        // ~ operator
        if (~number17 == -11) {
            System.out.println("The number is odd.");
        }

        // << operator example
        int number18 = 10;

        // << operator
        if ((number18 << 1) == 20) {
            System.out.println("The number is even.");
        }

        // >> operator example
        int number19 = 10;

        // >> operator
        if ((number19 >> 1) == 5) {
            System.out.println("The number is odd.");
        }

        // Assignment operators
        // Assignment operators are used to assign values to variables
        // Assignment operators are used to assign values to variables using =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, and >>=
        // Assignment operators are used to assign values to variables using =
        // Assignment operators are used to assign values to variables using +=
        // Assignment operators are used to assign values to variables using -=
        // Assignment operators are used to assign values to variables using *=
        // Assignment operators are used to assign values to variables using /=
        // Assignment operators are used to assign values to variables using %=
        // Assignment operators are used to assign values to variables using &=
        // Assignment operators are used to assign values to variables using |=
        // Assignment operators are used to assign values to variables using ^=
        // Assignment operators are used to assign values to variables using <<=
        // Assignment operators are used to assign values to variables using >>=

        // Assignment operators example
        int number20 = 10;

        // Assignment operators
        number20 += 5; // number20 = number20 + 5
        number20 -= 5; // number20 = number20 - 5
        number20 *= 5; // number20 = number20 * 5
        number20 /= 5; // number20 = number20 / 5
        number20 %= 5; // number20 = number20 % 5
        number20 &= 5; // number20 = number20 & 5
        number20 |= 5; // number20 = number20 | 5
        number20 ^= 5; // number20 = number20 ^ 5
        number20 <<= 5; // number20 = number20 << 5
        number20 >>= 5; // number20 = number20 >> 5

        // Increment and decrement operators
        // Increment and decrement operators are used to increase or decrease the value of a variable by 1
        // Increment and decrement operators are used to increase or decrease the value of a variable by 1 using ++ and --
        // Increment and decrement operators are used to increase or decrease the value of a variable by 1 using ++
        // Increment and decrement operators are used to increase or decrease the value of a variable by 1 using --

        // Increment and decrement operators example
        int number21 = 10;

        // Increment and decrement operators
        number21++; // number21 = number21 + 1
        number21--; // number21 = number21 - 1

        // Operator precedence
        // Operator precedence is used to determine the order of evaluation of operators
        // Operator precedence is used to determine the order of evaluation of operators in an expression
        // Operator precedence is used to determine the order of evaluation of operators in an expression using parentheses
        // Operator precedence is used to determine the order of evaluation of operators in an expression using parentheses, unary operators, multiplicative operators, additive operators, shift operators, relational operators, equality operators, bitwise AND operator, bitwise XOR operator, bitwise OR operator, logical AND operator, and logical OR operator

        // Operator precedence example
        int result2 = 10 + 5 * 2; // 20
        int result3 = (10 + 5) * 2; // 30

        // Operator associativity
        // Operator associativity is used to determine the order of evaluation of operators with the same precedence
        // Operator associativity is used to determine the order of evaluation of operators with the same precedence from left to right
        // Operator associativity is used to determine the order of evaluation of operators with the same precedence from right to left

        // Operator associativity example
        int result4 = 10 - 5 + 2; // 7
        int result5 = 10 - (5 + 2); // 3

        // Short-circuit evaluation
        // Short-circuit evaluation is used to evaluate logical expressions
        // Short-circuit evaluation is used to evaluate logical expressions by evaluating the left operand first
        // Short-circuit evaluation is used to evaluate logical expressions by evaluating the right operand first

        // Short-circuit evaluation example
        int number22 = 10;

        // Short-circuit evaluation
        if (number22 > 0 && number22 % 2 == 0) {
            System.out.println("The number is positive and even.");
        }

        // Conditional statements
        // Conditional statements are used to execute a block of code based on a condition
        // Conditional statements are used to execute a block of code based on a condition being true or false
        // Conditional statements are used to execute a block of code based on a condition being true
        // Conditional statements are used to execute a block of code based on a condition being false

        // Conditional statements example
        int number23 = 10;

        // Conditional statements
        if (number23 > 0) {
            System.out.println("The number is positive.");
        }

        // Looping statements
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
        for (int number28 : numbers) {
            System.out.println("The number is " + number28);
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

        // Branching statements
        // Branching statements are used to transfer control to another part of the program
        // Branching statements are used to transfer control to another part of the program based on a condition
        // Branching statements are used to transfer control to another part of the program based on a condition being true or false
        // Branching statements are used to transfer control to another part of the program based on a condition being true
        // Branching statements are used to transfer control to another part of the program based on a condition being false

        // Branching statements example
        int number32 = 10;

        // Branching statements
        if (number32 > 0) {
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
