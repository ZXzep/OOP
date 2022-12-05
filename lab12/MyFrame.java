package lab12;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MyFrame implements MouseListener{
    private JFrame frame;
    private MyClock clock;
    private Thread t;
    private int checkPause = 0;

    public MyFrame(){
        frame = new JFrame();
        clock = new MyClock();
        t = new Thread(clock);
        t.start();
    
        clock.addMouseListener(this);
        
        frame.setLayout(new FlowLayout());
        frame.add(clock);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new MyFrame();
    }
    
    public synchronized void mouseClicked(MouseEvent ev){
        if(checkPause%2==0){
            clock.pauseThread();
        }
        else{
            clock.resumeThread();
        }
        checkPause++;
    }
    public void mouseEntered(MouseEvent ev){}
    public void mouseExited(MouseEvent ev){}
    public void mousePressed(MouseEvent ev){}
    public void mouseReleased(MouseEvent ev){}
}