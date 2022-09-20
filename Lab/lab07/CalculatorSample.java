import javax.swing.*;
import java.awt.*;
public class CalculatorSample extends JFrame{
    public CalculatorSample(){
        JFrame f = new JFrame("Calculator"); 
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JTextField txt = new JTextField();
        JButton b1 = new JButton("0");
        JButton b2 = new JButton("c");
        JButton b3 = new JButton("=");
        JButton b4 = new JButton("/");
        JButton b5 = new JButton("1");
        JButton b6 = new JButton("2");
        JButton b7 = new JButton("3");
        JButton b8 = new JButton("x");
        JButton b9 = new JButton("4");
        JButton b10 = new JButton("5");
        JButton b11 = new JButton("6");
        JButton b12 = new JButton("-");
        JButton b13 = new JButton("7");
        JButton b14 = new JButton("8");
        JButton b15 = new JButton("9");
        JButton b16 = new JButton("+");
        panel2.setLayout(new BorderLayout());
        txt.setEditable(false);
        f.add(txt, BorderLayout.NORTH);
        panel1.setLayout(new GridLayout(4, 4));
        panel1.add(b13);  panel1.add(b14);  panel1.add(b15);  panel1.add(b16);
        panel1.add(b9);  panel1.add(b10);  panel1.add(b11);  panel1.add(b12);
        panel1.add(b5);  panel1.add(b6);  panel1.add(b7);  panel1.add(b8);
        panel1.add(b1);  panel1.add(b2);  panel1.add(b3);  panel1.add(b4);

        f.add(panel2);
        f.add(panel1);
        f.pack();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


public static void main(String[] args) {
    new CalculatorSample();
}}