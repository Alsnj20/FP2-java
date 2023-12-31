import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TicTacToe extends JFrame{
    private JButton btn1 = new JButton();
    private JButton btn2 = new JButton();
    private JButton btn3 = new JButton();
    private JButton btn4 = new JButton();
    private JButton btn5 = new JButton();
    private JButton btn6 = new JButton();
    private JButton btn7 = new JButton();
    private JButton btn8 = new JButton();
    private JButton btn9 = new JButton();
    private int turno = 1;

    public TicTacToe(){
        setTitle("TIC TAC TOE");
        setSize(300,300);
        setLayout(new GridLayout(3, 3));
        createContent();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
    }
    public void createContent(){
        add(btn1); add(btn2); add(btn3);
        add(btn4); add(btn5); add(btn6);
        add(btn7); add(btn8); add(btn9);
        btn1.addActionListener(new Listener());
        btn2.addActionListener(new Listener());
        btn3.addActionListener(new Listener());
        btn4.addActionListener(new Listener());
        btn5.addActionListener(new Listener());
        btn6.addActionListener(new Listener());
        btn7.addActionListener(new Listener());
        btn8.addActionListener(new Listener());
        btn9.addActionListener(new Listener());
    }
    private class Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JButton btn = (JButton) e.getSource();
            if(btn.getText().equals("")){
                if(turno == 1){
                    btn.setText("X");btn.setForeground(Color.BLUE);
                }else{
                    btn.setText("0");btn.setForeground(Color.RED);
                }
            }
            turno = (turno==1)?2:1;  
        }
    }
    public static void main(String[] args){
        new TicTacToe();
    }
}
