import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BSTUI extends JFrame implements ActionListener {

    private BST bst;
    private JTextField textField;
    private JTextArea textArea;

    public BSTUI() {
        super("BST UI");

        // Create BST object
        bst = new BST();
        bst.insert(20);
        bst.insert(10);
        bst.insert(25);
        bst.insert(5);
        bst.insert(15);
        bst.insert(22);
        bst.insert(30);
        bst.insert(21);
        bst.insert(24);
        bst.insert(28);
        bst.insert(35);

        // Set up UI components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        getContentPane().add(panel);

        JLabel label = new JLabel("Enter room name:");
        panel.add(label);

        textField = new JTextField();
        panel.add(textField);

        JButton button = new JButton("Enter");
        button.addActionListener(this);
        panel.add(button);

        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String roomName = textField.getText();
        int roomNumber = getRoomNumber(roomName);
        if (roomNumber == -1) {
            textArea.append("Room not found\n");
        } else {
            List<String> path = bst.getPathTo(roomNumber);
            textArea.append("Path to room " + roomName + ": " + String.join(" -> ", path) + " -> END\n");
        }
        textField.setText("");
    }

    private int getRoomNumber(String roomName) {
        switch (roomName) {
            case "K1":
                return 20;
            case "R101":
                return 10;
            case "K2":
                return 25;
            case "R102":
                return 5;
            case "R103":
                return 15;
            case "R201":
                return 22;
            case "R204":
                return 30;
            case "R202":
                return 21;
            case "R203":
                return 24;
            case "R205":
                return 28;
            case "R206":
                return 35;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        new BSTUI();
    }

}
