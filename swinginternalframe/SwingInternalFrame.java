package swinginternalframe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyInternalFrame extends JInternalFrame
{
    static int count=0;
    JTextArea tf;
    JScrollPane sp;

     MyInternalFrame() {
        super("Document" + (++count), true, true, true, true);
        tf=new JTextArea();
        sp=new JScrollPane(tf);
        add(sp);

        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem m1=new JMenuItem("Save");

        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300,300);
        setLocation(50,50);
        setVisible(true);

    }


    


}
class MyFrame extends JFrame implements ActionListener
{
    JDesktopPane dp;

    MyFrame()
    {
        super("InternalFrame Demo");
        dp=new JDesktopPane();
        setContentPane(dp);

        JMenuBar mb=new JMenuBar();
        JMenu d=new JMenu("Document");
        JMenuItem mi=new JMenuItem("New");

        d.add(mi);
        mb.add(d);
        setJMenuBar(mb);

        mi.addActionListener(this);

        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        MyInternalFrame m1=new MyInternalFrame();
        dp.add(m1);
    }
}





public class SwingInternalFrame {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(800,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
