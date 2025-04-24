package selenium.frameworkutilities;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotActions {

    public static void main(String[] args) {
        try {
            // Create an instance of the Robot class
            Robot robot = new Robot();

            // Delay for 2 seconds (2000 milliseconds) to observe actions
            robot.delay(5000);

            robot.keyPress(KeyEvent.VK_SHIFT); // Press Shift for uppercase 'S'
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_SHIFT);

            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);

            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_L);

            robot.keyPress(KeyEvent.VK_E);
            robot.keyRelease(KeyEvent.VK_E);

            robot.keyPress(KeyEvent.VK_N);
            robot.keyRelease(KeyEvent.VK_N);

            robot.keyPress(KeyEvent.VK_I);
            robot.keyRelease(KeyEvent.VK_I);

            robot.keyPress(KeyEvent.VK_U);
            robot.keyRelease(KeyEvent.VK_U);

            robot.keyPress(KeyEvent.VK_M);
            robot.keyRelease(KeyEvent.VK_M);

            // Move the mouse to a specific screen coordinate (x=500, y=300)
            robot.mouseMove(500, 300);
            robot.keyPress("A".charAt(0));
            robot.keyRelease("A".charAt(0));

            // Perform a left mouse click
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

            // Delay for 1 second
            robot.delay(1000);

            // Perform a right mouse click
            robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

            // Delay for 1 second
            robot.delay(1000);

            // Simulate pressing and releasing the 'A' key
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);

            // Delay for 1 second
            robot.delay(1000);

            // Simulate pressing and releasing the 'Ctrl + S' key combination
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // Delay for 1 second
            robot.delay(1000);

            System.out.println("Robot actions completed!");

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}

