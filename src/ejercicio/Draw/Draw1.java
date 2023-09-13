package ejercicio.Draw;

import javax.swing.*;
import java.awt.*;

public class Draw1 extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int lines = 15;
        int width = getWidth();
        int height = getHeight();
        int position_x = width / lines;
        int position_y = height / lines;

        // Loop to draw lines
        for (int i = 0; i < lines; i++) {
            int x = width - i * position_x;
            int y = i * position_y;

            g.drawLine(0, 0, x, y);
        }

    }


}

