package Programa1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FactorialCalculator extends JFrame{
    private JTextField input1 = new JTextField(3);
    private JTextField input2 = new JTextField(15);
    private JButton button = new JButton("Factorial");
    public FactorialCalculator(){
        setTitle("Factorial Calculator");
        setSize(400, 100);
        setLayout(new FlowLayout());
        createContents();
        setVisible(true);
    }
    public void createContents(){
        JLabel tag1 = new JLabel("x:");
        JLabel tag2 = new JLabel("x!:");
        add(tag1); add(input1); add(tag2);  add(input2); add(button);
        input1.addActionListener(new Listener());
    }
    private class Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            input2.setEditable(false);
            int fact = Integer.parseInt(input1.getText());
            if(fact<0){
                input2.setText("Undefined");
            }else if(fact == 0 || fact == 1){input2.setText("1");
            }else{
                int factorial = 1;
                for (int i = 1; i <= fact; i++)
                    factorial *=(fact+1-i);
                input2.setText(factorial+"");
            }
        }
    }
    public static void main(String[] args) {
        new FactorialCalculator();
    }
}