/*import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class RectangleViewBuilder {
    private JPanel panel;
    private int borderWidth;

    public RectangleViewBuilder(int borderWidth) {
        this.borderWidth = borderWidth;
        panel = new JPanel();
        panel.setLayout(null);
    }

    public RectangleViewBuilder addRectangle(int x, int y, int width, int height) {
        JPanel rectangle = new JPanel();
        rectangle.setBounds(x, y, width, height);
        rectangle.setBackground(Color.WHITE);
        rectangle.setBorder(new LineBorder(Color.BLACK, borderWidth)); // set custom border width
        panel.add(rectangle);
        return this;
    }

    public JPanel build() {
        return panel;
    }
}*/