package ejercicio;
import ejercicio.Draw.Draw1;
import ejercicio.Draw.Draw2;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        // Ventana para Parte 1
        Draw1 draw = new Draw1(); // Crea una instancia de la clase Draw1 y la almacena en la variable "draw".

        JFrame frame = new JFrame("Ejercicio-1"); // Crea una instancia de la clase JFrame llamada "frame" y establece un título para la ventana.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configura la acción de cierre de la ventana al salir del programa.
        frame.add(draw); // Agrega la instancia de Draw1 (un componente gráfico) a la ventana.
        frame.setSize(500, 500); // Establece el tamaño de la ventana a 500x500 píxeles.
        frame.setVisible(true); // Hace que la ventana sea visible en la pantalla.


        // Ventana para Parte 2
        Draw2 draw2 = new Draw2(); // Crea una instancia de la clase Draw2 y la almacena en la variable "draw2".

        JFrame frame2 = new JFrame("Ejercicio-2"); // Crea una segunda instancia de JFrame llamada "frame2" con un título diferente.
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Configura la acción de cierre de la segunda ventana.
        frame2.add(draw2); // Agrega la instancia de Draw2 (otro componente gráfico) a la segunda ventana.
        frame2.setSize(500, 500); // Establece el tamaño de la segunda ventana a 500x500 píxeles.
        frame2.setVisible(true); // Hace que la segunda ventana sea visible en la pantalla.
    }
}
