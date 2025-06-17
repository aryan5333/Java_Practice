package swingsliderdemo;
import java.awt.*;
import javax.crypto.interfaces.PBEKey;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class MyFrame extends JFrame implements ChangeListener
{
    JSlider s;
    JPanel p1,p2;
    JProgressBar ps;
    int w=50;

    MyFrame()
    {
        super("Slider Demo");
        s=new JSlider();
        s.setMajorTickSpacing(10);
        s.setMinorTickSpacing(1);
        s.setPaintTicks(true);
        s.setPaintLabels(true);

        ps=new JProgressBar();
        ps.setString("50%");
        ps.setStringPainted(true);
        //ps.setIndeterminate(true);

        p1=new JPanel(){
            public void paintComponent(Graphics g)
            {
                g.drawOval(100,100,50,50);
            }
        };
        p2=new JPanel();
        p2.add(ps);

        add(s,BorderLayout.NORTH);
        add(p1,BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);
        s.addChangeListener(this);
        
    }
    public void stateChanged(ChangeEvent e)
    {
        w=s.getValue();
        p1.repaint();
        ps.setString(w+"%");
        ps.setStringPainted(true);
        ps.setValue(w);
        

    }
}

public class SwingSliderDemo {
    public static void main(String[]args)
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
