import javax.swing.*;
import java.awt.*;
public class TellerGUI extends JFrame{
    public TellerGUI(){
        JFrame fr = new JFrame();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JButton b1 = new JButton("Deposit");
        JButton b2 = new JButton("Withdraw");
        JButton b3 = new JButton("Exit");
        JLabel txt1 = new JLabel("Balance");
        JTextField tf1 = new JTextField("6000");
        JLabel txt2 = new JLabel("Amount");
        JTextField tf2 = new JTextField();
        fr.setTitle("Teller GUI");
        p1.setLayout(new GridLayout(1,2));
        p1.add(txt1);   p1.add(tf1);
        tf1.setEditable(false);
        
        p2.setLayout(new GridLayout(1,2));
        p2.add(txt2); p2.add(tf2);

        p3.setLayout(new GridLayout(1,3));
        p3.add(b1); p3.add(b2); p3.add(b3);

        fr.setLayout(new GridLayout(3,1));
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.pack();
        // fr.setSize(500, 400);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
public static void main(String[] args) {
    new TellerGUI();
}
}
