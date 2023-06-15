import javax.swing.*; // Importar todas las clases de paquetes necesarias, javax.swing proporciona algo basico para la creacion de GUI

public class Ejemplo { // Que definir una clase publica que sera el mismo nombre de archivo de
                       // Ejemplo.java
    public static void main(String[] args) { // Definimos que esta clase es nuestra clase main y debe ejecutarse apenas
                                             // corremos el codigo.
        JFrame frame = new JFrame("Hola", null); // Colocamos nombre a la aplicacion
        JLabel label = new JLabel("hola", null, JLabel.CENTER); // Escribimos contenido que luego llamaremos a la
                                                                // interfaz grafica de usuario con un mensaje centrado
                                                                // en el medio.
        frame.getContentPane().add(label); // Llamamos al contenido que creamos con el nombre label.
        frame.setSize(300, 300); // Colocamos un tamaño de 300x300 a la aplicacion.
        frame.setVisible(true); // Definimos que sea visible el marco en lo que se muestra en la pantalla.
    }
}