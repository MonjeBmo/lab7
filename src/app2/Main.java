package app2;

import app2.EjemploFiguras.EjemploFiguras;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crea una instancia de la clase EjemploFiguras.
        EjemploFiguras ejemploFiguras = new EjemploFiguras();
        // Crea una instancia de la clase JFrame y establece un título para la ventana.
        JFrame ventana = new JFrame("Ejemplo Figuras");
        // Configura la acción de cierre de la ventana al salir del programa.
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Agrega la instancia de EjemploFiguras al contenido de la ventana.
        ventana.add(ejemploFiguras);
        // Establece el tamaño de la ventana a 500x500 píxeles.
        ventana.setSize(500, 500);
        // Hace que la ventana sea visible en la pantalla.
        ventana.setVisible(true);
    }
}
