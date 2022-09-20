import javax.swing.*;
import java.awt.*;

public class MmGUI extends JFrame{
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi2, mi3, mi4, msi1, msi2;
    public MmGUI(){
        fr = new JFrame("SubMenuitem Demo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");

        ms1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");

        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");

        fr.setJMenuBar(mb);
        mb.add(m1); mb.add(m2); mb.add(m3);
        m1.add(ms1);
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        ms1.add(msi1);
        ms1.add(msi2);

        fr.setSize(200,150);
        fr.setVisible(true);
    }
public static void main(String[] args) {
    new MmGUI();
}
}
