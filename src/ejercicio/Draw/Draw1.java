package ejercicio.Draw;

import javax.swing.*;
import java.awt.*;


public class Draw1 extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Número de líneas que se dibujarán.
        int lines = 15;

        // Obtiene el ancho de este JPanel.
        int width = getWidth();

        // Obtiene la altura de este JPanel.
        int height = getHeight();

        // Calcula la distancia horizontal entre las líneas.
        int position_x = width / lines;

        // Calcula la distancia vertical entre las líneas.
        int position_y = height / lines;

        // Bucle para dibujar las líneas diagonales.
        for (int i = 0; i < lines; i++) {
            // Coordenada x del extremo de la línea.
            int x = width - i * position_x;

            // Coordenada y del extremo de la línea.
            int y = i * position_y;

            // Dibuja una línea desde el punto (0,0) hasta (x, y).
            g.drawLine(0, 0, x, y);
        }
    }


}

