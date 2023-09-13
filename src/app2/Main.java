package app2;

import app2.EjemploFiguras.EjemploFiguras;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        EjemploFiguras ejemploFiguras = new EjemploFiguras();
        JFrame ventana = new JFrame("Ejemplo Figuras");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(ejemploFiguras);
        ventana.setSize(500, 500);
        ventana.setVisible(true);
    }

}
