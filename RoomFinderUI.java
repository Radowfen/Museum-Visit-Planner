/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import javax.imageio.ImageIO;

public class RoomFinderUI extends JFrame implements ActionListener {

    private BST bst;
    private JTextField textField;
    private JTextArea textArea;
    private JLabel imageLabel;

    public RoomFinderUI() {
        super("Room Finder");

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

        // Load the image from the URL
        BufferedImage image = null;
        try {
            URL url = new URL("https://drive.google.com/uc?export=download&id=1APWoxeCGnYpBf6bLHgg8LWJzCSVYP4BE");
            image = ImageIO.read(url);

            //old: https://drive.google.com/file/d/12XCUYNmj379ZmaFtH9QzzdIY4zIdKZU0/view?usp=share_link
            //new: https://drive.google.com/file/d/1APWoxeCGnYpBf6bLHgg8LWJzCSVYP4BE/view?usp=share_link

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create a JLabel with the image
        imageLabel = new JLabel(new ImageIcon(image));

        // Create a JPanel and add the label to it
        JPanel imagePanel = new JPanel();
        imagePanel.add(imageLabel);

        // Add the image panel to the main panel
        panel.add(imagePanel);

        // Set frame properties
        setSize(1200, 900);
        setMinimumSize(new Dimension(800, 600));  // set minimum size of frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    BSTUI bstUI = new BSTUI();

    // Load the image from the URL
    BufferedImage image = null;
    try {
        URL url = new URL("https://drive.google.com/uc?export=download&id=1APWoxeCGnYpBf6bLHgg8LWJzCSVYP4BE");
        image = ImageIO.read(url); 

    } catch (IOException ex) {
        ex.printStackTrace();
    }

    // Create a JLabel with the image
    JLabel label = new JLabel(new ImageIcon(image));

    // Create a JPanel and add the label to it
    JPanel panel = new JPanel();
    panel.add(label);

    // Add the panel to the existing BSTUI frame
    bstUI.getContentPane().add(panel, BorderLayout.SOUTH);
    }

   
}
*/