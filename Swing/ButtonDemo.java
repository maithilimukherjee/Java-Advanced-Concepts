import java.awt.*;
import java.awt.event.*;

class ButtonDemo extends Frame implements ActionListener {
    Button b = new Button("click me");

    ButtonDemo() {
        add(b);                  // add button to frame
        b.addActionListener(this); // register listener
        setSize(200, 100);       
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("button clicked!");
    }

    public static void main(String[] args) {
        new ButtonDemo();
    }
}
