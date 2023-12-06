import javax.swing.*;
class Ventana{
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setSize(300, 200);
        ventana.setTitle("Ventana de ejemplo");
        JLabel tag = new JLabel("this is a tag");
        
        JTextField input = new JTextField(15);
        input.setText("hola");
        input.setEditable(false);
        input.setVisible(true);
        ventana.add(tag);ventana.add(input);
        ventana.setVisible(true); /*contenido visible */ 
    }   
}
