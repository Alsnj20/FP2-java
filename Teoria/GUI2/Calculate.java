
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculate extends JFrame {
    private JTextField input1;
    private JButton sqrC;
    private JTextField sqr;
    private JButton logC;
    private JTextField log;
    public Calculate(){
        setTitle("Calculate sqrt or log");
        setSize(400,150);
        setLayout(new FlowLayout());
        createContent();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(188, 143, 143));
        setVisible(true);  
    }
    public void createContent(){
        JPanel box1 = new JPanel(new GridLayout(2,1));
        JPanel box12 = new JPanel(new FlowLayout());
        JLabel tag1 = new JLabel("x:");
        input1 = new JTextField(8);
        box12.add(tag1); box12.add(input1);
        box1.add(box12);

        JPanel box21 = new JPanel(new FlowLayout());
        sqrC = new JButton("sqrt x");
        sqr = new JTextField(12); sqr.setEditable(false);
        box21.add(sqrC); box21.add(sqr);
        JPanel box22 = new JPanel(new FlowLayout());
        logC = new JButton("log x");
        log = new JTextField(12); log.setEditable(false);
        box22.add(logC); box22.add(log);

        JPanel box2 = new JPanel(new GridLayout(2,1));
        box2.add(box21); box2.add(box22);
        add(box1); add(box2);
        
        sqrC.addActionListener(new Listener());
        logC.addActionListener(new Listener());
    }
    private class Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            double n = Double.parseDouble(input1.getText());
            if(e.getSource() == sqrC) sqr.setText(Math.sqrt(n)+"");
            if(e.getSource() == logC) log.setText(Math.log(n)+"");
        }
    }
    public static void main(String[] args) {
        new Calculate();
    }
}
