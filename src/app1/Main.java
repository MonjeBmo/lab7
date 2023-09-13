package app1;

import app1.Dibujo.Dibujo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Dibujo dibujo = new Dibujo();
        JFrame ventana = new JFrame("Dibujo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(dibujo);
        ventana.setSize(300, 300);
        ventana.setVisible(true);
    }
}