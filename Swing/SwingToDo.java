import javax.swing.*;
import java.awt.*;

public class SwingToDo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("To-Do List");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new FlowLayout());

            frame.add(new JLabel("Task: "));
            frame.add(new JTextField(20));
            frame.add(new JLabel("Priority: "));
            frame.add(new JComboBox<>(new String[]{"Low", "Medium", "High"}));
            frame.add(new JButton("Add Task"));
            frame.add(new JCheckBox("Mark as Completed"));

            frame.add(new JLabel("Showing Tasks Added: "));

            // ✅ Proper JTable with columns and scroll pane
            String[] columns = {"Task", "Priority", "Completed"};
            Object[][] data = {
                {"Example task", "Medium", false}
            };
            JTable table = new JTable(data, columns);
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setPreferredSize(new Dimension(400, 200));
            frame.add(scrollPane);

            frame.setVisible(true);
        });
    }
}

/*
 * This code creates a simple Swing GUI for a To-Do list application.
 * It includes labels, text fields, a combo box for priority selection,
 * a button to add tasks, a checkbox to mark tasks as completed,
 * and a JTable to display the list of tasks in a structured format.
 * The JTable is placed inside a JScrollPane to allow for scrolling
 * when there are many tasks.
 * Non functional layout, btw. 
 */