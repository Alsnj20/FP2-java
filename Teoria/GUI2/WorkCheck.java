
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WorkCheck extends JFrame {
    JCheckBox check1;
    JCheckBox check2;
    JCheckBox check3;
    JComboBox salary;
    public WorkCheck() {
        setTitle("Job Application Form");
        setSize(200,315);
        setLayout(new BorderLayout());
        createContent();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // getContentPane().setBackground(new Color(188, 143, 143));
        setVisible(true);
    }
    public void createContent() {
        JPanel box1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel sentence1 = new JLabel("Skills (check all that apply):");
        check1 = new JCheckBox("Java Sun certified");
        check2 = new JCheckBox("help-desk experience");
        check3 = new JCheckBox("able to make good coffee");
        box1.add(sentence1); box1.add(check1); box1.add(check2); box1.add(check3);
        
        JLabel sentence2 = new JLabel("Community standing:");
        JRadioButton radio1 = new JRadioButton("law-abiding citizen");
        JRadioButton radio2 = new JRadioButton("violent criminal");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radio1); radioGroup.add(radio2); /*seleccionar solo 1 opcion */
        box1.add(sentence2);box1.add(radio1); box1.add(radio2);
        
        JLabel sentence3 = new JLabel("Salary requirements:");
        String[] salaries = {"$10,000-$19,000", "$20,000-59,000", "$60,000-$99,000","more Salary"};
        salary = new JComboBox<>(salaries);
        box1.add(sentence3); box1.add(salary);
    
        JPanel box2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btn = new JButton("Submit");
        box2.add(btn);

        add(box1,BorderLayout.CENTER ); add(box2, BorderLayout.SOUTH);
    
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JTextArea tex1 = new JTextArea(); 
                JTextArea tex2 = new JTextArea();
                tex2.setText("Sorry, no jobs at this time.");
                tex1.setText("Thank you for your application submission.\n"+
                "We'll contact you after we process your information");
            
                if (hasQualifyingSkill() && radio1.isSelected() && isValidSalary()) {
                    JOptionPane.showMessageDialog(null, tex1.getText());
                } else {
                    JOptionPane.showMessageDialog(null, tex2.getText());
                }
            }
        });
    }
    
    public boolean hasQualifyingSkill() {
        return check1.isSelected() || check2.isSelected() || check3.isSelected();
    }
    public boolean isValidSalary() {
        return !salary.getSelectedItem().equals("more Salary");
    }

    public static void main(String[] args) {
        new WorkCheck();
    }
}
