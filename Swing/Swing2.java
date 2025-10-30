import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Swing2
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("my second swing app");

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    });
}
}

/*
 * Code explanation:
 * - We import the necessary Swing classes: JFrame for the window and SwingUtilities
 * for thread safety.
 * - We create a public class named Swing2.
 * - In the main method, we use SwingUtilities.invokeLater to ensure that the GUI
 * creation runs on the Event Dispatch Thread (EDT), which is the proper way to
 * handle Swing components.
 * - Inside the Runnable, we create a JFrame object with the title "my second swing
 * app".
 * - We set the size of the frame to 500 pixels wide and 500 pixels tall.
 * - We set the default close operation to EXIT_ON_CLOSE, which will terminate the
 * application when the frame is closed.
 * - We center the frame on the screen using setLocationRelativeTo(null).
 * - Finally, we make the frame visible by calling setVisible(true).    
 */