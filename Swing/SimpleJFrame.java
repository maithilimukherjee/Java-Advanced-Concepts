import javax.swing.*;

public class SimpleJFrame
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("my first swing app");

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

/*
 * Code explanation:
 * - We import the javax.swing package to use Swing components.
 * - We create a public class named SimpleJFrame.
 * - In the main method, we create a JFrame object with the title "my first swing
 * app".
 * - We set the size of the frame to 400 pixels wide and 300 pixels tall
 * - We set the default close operation to EXIT_ON_CLOSE, which will terminate the
 * application when the frame is closed.
 * - We center the frame on the screen using setLocationRelativeTo(null).
 * - Finally, we make the frame visible by calling setVisible(true).
 */