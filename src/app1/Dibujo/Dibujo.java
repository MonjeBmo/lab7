package app1.Dibujo;

import java.awt.*;
import javax.swing.*;

public class Dibujo extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Obtiene el ancho y la altura de este JPanel.
        int width = getWidth();
        int height = getHeight();
        // Dibuja una línea diagonal desde (0,0) hasta (width, height).
        g.drawLine(0, 0, width, height);
        // Dibuja una segunda línea diagonal desde (0, height) hasta (width, 0).
        g.drawLine(0, height, width, 0);
    }


}
