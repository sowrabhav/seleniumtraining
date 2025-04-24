package org.javapractice;

public class BreakContinueJump {
    public static void main(String[] args) {
        BreakContinueJump breakContinueJump = new BreakContinueJump();
        breakContinueJump.sum(10, 20);

        // Break statement example
        int number29 = 10;

        // Break statement
        for (int l = 0; l < number29; l++) {
            if (l == 5) {
                break;
            }
            System.out.println("The number is " + l);

        }


        // Continue statement example
        int number30 = 10;

        // Continue statement
        for (int m = 0; m < number30; m++) {
            if (m == 5) {
                continue;
            }
            System.out.println("The number is " + m);
        }

    }

    public int sum(int a, int b){
        return a+b;
    }

}
