package app1.Dibujo;

import java.awt.*;
import javax.swing.*;

public class Dibujo  extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();

        g.drawLine(0,0, width, height);
        g.drawLine(0, height, width, 0);
    }

}
