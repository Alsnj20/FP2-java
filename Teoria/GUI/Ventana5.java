/*crear una ventana que sirva como
contenedor a un cuadro de diálogo */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana5 extends JFrame{
    public Ventana5(){
        setSize(400, 200);
        setTitle("Saludos");
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args) {
        Ventana5 vent = new Ventana5();
        JOptionPane.showMessageDialog(vent,"hola");
        /*cada elemento es independiente */
    }
}