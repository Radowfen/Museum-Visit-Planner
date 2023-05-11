import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class BSTApp extends JFrame implements ActionListener {

    private BST bst;
    private JTextField textField;
    private JTextArea textArea;
    private JLabel imageLabel;

    public BSTApp() {
        super("BST App");

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

        

        

        
        JLabel label = new JLabel("Enter a room name ");
        //label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 200)); // add left padding
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(label);
        

        
        // Set up text field for room name
        JPanel roomNamePanel = new JPanel();
        roomNamePanel.setMaximumSize(new Dimension(200, 50));
        roomNamePanel.setLayout(new BorderLayout());
        textField = new JTextField();
        roomNamePanel.add(textField);

        panel.add(roomNamePanel);


        


     
        // Set up text field for room number
        JPanel roomNumberPanel = new JPanel();
        roomNumberPanel.setMaximumSize(new Dimension(200, 50));
        roomNumberPanel.setLayout(new BorderLayout());
        JButton button = new JButton("Enter");
        button.addActionListener(this);
        roomNumberPanel.add(button);
        panel.add(roomNumberPanel);


        
        // Set up text area for output
        JPanel textAreaPanel = new JPanel();
        textAreaPanel.setSize(new Dimension(500, 100));
        textAreaPanel.setLayout(new BorderLayout());
        textArea = new JTextArea(10, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textAreaPanel.add(scrollPane, BorderLayout.CENTER);
        panel.add(textAreaPanel);


        BufferedImage image = null;
        try {
            URL url = new URL("https://drive.google.com/uc?export=download&id=1APWoxeCGnYpBf6bLHgg8LWJzCSVYP4BE");
            image = ImageIO.read(url);
        
            // Scale the image down by 0.8
            int newWidth = (int) (image.getWidth() * 0.8);
            int newHeight = (int) (image.getHeight() * 0.8);
            Image scaledImage = image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = image.createGraphics();
            g2d.drawImage(scaledImage, 0, 0, null);
            g2d.dispose();
        
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Create a JLabel with the scaled image
        imageLabel = new JLabel(new ImageIcon(image));
        
        // Create a JPanel and add the label to it
        JPanel imagePanel = new JPanel();
        imagePanel.add(imageLabel);
        
        // Add the image panel to the main panel
        panel.add(imagePanel);
        
        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
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
        new BSTApp();
    }

}
