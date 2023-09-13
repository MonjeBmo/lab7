package app2.EjemploFiguras;

import javax.swing.*;
import java.awt.*;

public class EjemploFiguras extends JPanel {
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        // Dibuja una línea desde (50,50) hasta (200,50).
        g.drawLine(50, 50, 200, 50);
        // Dibuja un rectángulo con esquinas en (50,100) y un tamaño de 150x75.
        g.drawRect(50, 100, 150, 75);
        // Rellena un rectángulo con esquinas en (250,100) y un tamaño de 150x75.
        g.fillRect(250, 100, 150, 75);
        // Dibuja una elipse (ovalo) con esquinas en (50,200) y un tamaño de 150x100.
        g.drawOval(50, 200, 150, 100);
        // Rellena una elipse (ovalo) con esquinas en (250,200) y un tamaño de 150x100.
        g.fillOval(250, 200, 150, 100);
        // Establece el color de la tinta a azul.
        g.setColor(Color.BLUE);
        // Dibuja una cadena de texto en la ubicación (50, 350).
        g.drawString("Hola Mundo!, Este es un ejemplo de Java Graphics", 50, 350);
    }


}
