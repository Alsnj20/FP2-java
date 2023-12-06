import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana3 extends JFrame{
    private JTextField input;
    private JLabel greeting;
    public Ventana3(){
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
        /* clase interior anonima*/
        input.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e){
            /*action event e es para el JVM */
            String message = "Hola "+input.getText();
            input.setText(""); /*clear */
            greeting.setText(message);
            } 
        });
    }
    public static void main(String[] args) {
       new Ventana3();
    }
}