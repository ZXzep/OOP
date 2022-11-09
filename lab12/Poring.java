package lab12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class Poring extends JFrame implements Runnable, MouseListener{
    private JFrame f;
    private JTextField tf;
    private JLabel l;
    public Poring(int numberOfPoring){
        f = new JFrame();
        tf = new JTextField(numberOfPoring+"");
        l = new JLabel(new ImageIcon("lab12/Poring.png"));

        tf.setEditable(false);
        tf.setBorder(null);
        tf.setFont(new Font("Tahoma",Font.BOLD, 14));

        f.setLayout(new FlowLayout());
        f.add(l);    f.add(tf);

        l.addMouseListener(this);

        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setSize(170,135);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation((int)(Math.random()*(dimension.getWidth()-f.getWidth())), (int)(Math.random()*(dimension.getHeight()-f.getHeight())));
        f.setResizable(false);
        f.setVisible(true);
    }

    public void run(){
        try{
            while(true){
                Thread.sleep(30);
                if(Math.random()<=0.5){
                    if(Math.random()<=0.5){
                        f.setLocation(f.getX()+2, f.getY()+2);
                    }else{
                      f.setLocation(f.getX()-2, f.getY()-2);  
                    }
                }else{
                    if(Math.random()<=0.5){
                        f.setLocation(f.getX()+2, f.getY()-2);
                    }else{
                      f.setLocation(f.getX()-2, f.getY()+2);  
                    }
                }
            }
        }catch(Exception e){
            System.out.print(e);
        }
        
    }
    public synchronized void mouseClicked(MouseEvent ev){}
    public void mousePressed(MouseEvent ev){
        f.dispose();
    }
    public void mouseReleased(MouseEvent ev){}
    public void mouseEntered(MouseEvent ev){}
    public void mouseExited(MouseEvent ev){}
}
