import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana2 extends JFrame{
    private JTextField input;
    private JLabel greeting;
    public Ventana2(){
        setSize(300, 100);
        setTitle("Saludos");
        setLayout(new FlowLayout());
        createContents();
        setVisible(true);
    }
    public void createContents(){
        JLabel name = new JLabel("What your name?");
        input = new JTextField(15);
        greeting = new JLabel();
        add(name); add(input); add(greeting);
        List l = new List();
        input.addActionListener(l);
    }
    /*inner class */
    private class List implements ActionListener{
        public void actionPerformed(ActionEvent e){ /*polimorfismo con abstraccion */
            String message = "Hola "+input.getText();
            input.setText(""); /*clear */
            greeting.setText(message);
        }
    }
    public static void main(String[] args) {
       new Ventana2();
    }
}
