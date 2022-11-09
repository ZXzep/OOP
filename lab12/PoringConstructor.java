package lab12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PoringConstructor implements ActionListener{
    int numberOfPoring = 0;
    private JButton button;
    private JFrame f;
    private Poring poring;
    public PoringConstructor(){
        f = new JFrame();
        button = new JButton("Add");

        button.addActionListener(this);

        f.setLayout(new FlowLayout());
        f.add(button);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(170, 75);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ev){
        if(ev.getSource().equals(button)){
            numberOfPoring++;
            Poring poring = new Poring(numberOfPoring);
            Thread thread = new Thread(poring);
            thread.start();
        }
    }
    public static void main(String[] args) {
        new PoringConstructor();
    }
}
