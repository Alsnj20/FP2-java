/* crear una GUI con el siguiente diseño.
Cuando presione el botón Stop, el fondo se pondrá
rojo y cuando presione el botón Go, el fondo se
pondrá verde */
package Programa4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Chooser extends JFrame {
    private JButton red;
    private JButton green;
    public Chooser(){
        setTitle("Background Color Chooser");
        setSize(300, 100);
        setLayout(new FlowLayout());
        customize();
        setVisible(true);
    }
    public void customize(){
        red = new JButton("Stop");
        red.setBackground(Color.RED);
        green = new JButton("Go");
        green.setBackground(Color.GREEN);
        add(red); add(green);
        red.addActionListener(new Listener());
        green.addActionListener(new Listener());
    }
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Color c = (e.getSource() == red)?red.getBackground():green.getBackground();
            getContentPane().setBackground(c);
        }
    }
    public static void main(String[] args) {
        new Chooser();
    }
}
