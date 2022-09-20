import javax.swing.*;
import java.awt.*;
public class SimpleCalGUI extends JFrame{
    public SimpleCalGUI(){
        JFrame fr = new JFrame();
        
        JPanel p1 = new JPanel();
        JTextField tf1 = new JTextField(100);
        p1.add(tf1);
        
        JPanel p2 = new JPanel();
        JTextField tf2 = new JTextField(100);
        p2.add(tf2);

        JPanel p3 = new JPanel();
        JButton b1 = new JButton("Plus");
        JButton b2 = new JButton("Minus");
        JButton b3 = new JButton("Multiply");
        JButton b4 = new JButton("Divide");
        p3.setLayout(new GridLayout(1,4));
        p3.add(b1); p3.add(b2); p3.add(b3); p3.add(b4);

        JPanel p4 = new JPanel();
        JTextField tf4 = new JTextField(100);
        p4.add(tf4);
        
        fr.setLayout(new GridLayout(4,3));
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(p4);

        fr.setTitle("เครื่องคิดเลข");
        fr.pack();
        // fr.setSize(400, 400);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
public static void main(String[] args) {
    new SimpleCalGUI();
}
}
