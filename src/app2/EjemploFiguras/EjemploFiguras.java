package app2.EjemploFiguras;

import javax.swing.*;
import java.awt.*;

public class EjemploFiguras extends JPanel {
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        g.drawLine(50,50,200,50);
        g.drawRect(50,100,150,75);
        g.fillRect(250, 100, 150, 75);
        g.drawOval(50,200,150,100);
        g.fillOval(250,200,150,100);
        g.setColor(Color.BLUE);
        g.drawString("Hola Mundo!, Este es un ejemplo de Java Grapihcs", 50, 350);
    }

}
