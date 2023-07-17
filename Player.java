package Package1;

import javax.swing.*;
import java.awt.*;

class Rectangle extends JPanel {
    private Color color;
    private Point location;

    public Rectangle() {
        // Default constructor
    }

    public Rectangle(Color color, Point location) {
        this.color = color;
        this.location = location;
    }
    public void setColor(Color color) {
        this.color = color;
        repaint();
    }

    public Color getColor() {
        return color;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}