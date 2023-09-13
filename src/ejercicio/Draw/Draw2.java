package ejercicio.Draw;

import javax.swing.*;
import java.awt.*;

public class Draw2 extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int lines = 15; // Número de líneas que se dibujarán.
        int width = getWidth(); // Obtiene el ancho del JPanel.
        int height = getHeight(); // Obtiene la altura del JPanel.
        int position_x = width / lines; // Calcula la distancia horizontal entre las líneas.
        int position_y = height / lines; // Calcula la distancia vertical entre las líneas.

        for (int i = 0; i < lines; i++) {
            int x = width - i * position_x; // Coordenada x del extremo de la línea.
            int y = i * position_y; // Coordenada y del extremo de la línea.
            g.drawLine(0, 0, x, y); // Dibuja una línea desde (0,0) hasta (x, y).
        }

        for (int i = 0; i < lines; i++) {
            int x = width - i * position_x; // Coordenada x del extremo de la línea.
            int y = i * position_y; // Coordenada y del extremo de la línea.
            g.drawLine(width, height, x, y); // Dibuja una línea desde (width, height) hasta (x, y).
        }

        for (int i = 0; i < lines; i++) {
            int x = i * position_x; // Coordenada x del extremo de la línea.
            int y = i * position_y; // Coordenada y del extremo de la línea.
            g.drawLine(width, 0, x, y); // Dibuja una línea desde (width, 0) hasta (x, y).
        }

        for (int i = 0; i < lines; i++) {
            int x = i * position_x; // Coordenada x del extremo de la línea.
            int y = i * position_y; // Coordenada y del extremo de la línea.
            g.drawLine(0, height, x, y); // Dibuja una línea desde (0, height) hasta (x, y).
        }
    }
}
