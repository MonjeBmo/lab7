package app1;

import app1.Dibujo.Dibujo;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crea una instancia de la clase Dibujo.
        Dibujo dibujo = new Dibujo();
        // Crea una instancia de la clase JFrame y establece un título para la ventana.
        JFrame ventana = new JFrame("Dibujo");
        // Configura la acción de cierre de la ventana al salir del programa.
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Agrega la instancia de Dibujo al contenido de la ventana.
        ventana.add(dibujo);
        // Establece el tamaño de la ventana a 300x300 píxeles.
        ventana.setSize(300, 300);
        // Hace que la ventana sea visible en la pantalla.
        ventana.setVisible(true);
    }
}
