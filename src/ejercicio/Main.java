package ejercicio;

import ejercicio.Draw.Draw1;
import ejercicio.Draw.Draw2;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        Draw1 draw = new Draw1();
        JFrame frame = new JFrame("Ejercicio-1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(draw);
        frame.setSize(500, 500);
        frame.setVisible(true);

        Draw2 draw2 = new Draw2();
        JFrame frame2 = new JFrame("Ejercicio-2");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.add(draw2);
        frame2.setSize(500, 500);
        frame2.setVisible(true);


    }
}
