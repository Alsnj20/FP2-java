import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ventana4 extends JFrame{
    private JTextField input;
    private JLabel greeting;
    private JButton button;
    private JTextField input2;
    public Ventana4(){
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
        button = new JButton("Me amas?");
        input2 = new JTextField();
        /* clase interior anonima*/
        input.addActionListener(new List());
        add(name); add(input); add(greeting);add(button); add(input2);
        button.addActionListener(new List2());
    }
    private class List implements ActionListener{
        public void actionPerformed(ActionEvent e){
            /*action event e es para el JVM */
            String message = "Hola "+input.getText();
            input.setText(""); /*clear */
            greeting.setText(message);
        }
    }
    private class List2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String hola = "Yo tambien uwu :3";
            input2.setText(hola);
            input2.setEditable(false);
        }
    }
    public static void main(String[] args) {
       new Ventana4();
    }
}