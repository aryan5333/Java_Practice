package swingscrollbardemo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements AdjustmentListener
{
    JScrollBar red,orange,magneta;
    JTextField tf;

    MyFrame()
    {
        super("SwingScrollBarDemo");
        red=new JScrollBar(Scrollbar.HORIZONTAL,0,40,0,255);
        magneta=new JScrollBar(Scrollbar.HORIZONTAL,0,40,0,255);
        orange=new JScrollBar(Scrollbar.HORIZONTAL,0,40,0,255);
        tf=new JTextField(20);

        tf.setBounds(50,100,300,50);
        red.setBounds(50,150,300,40);
        magneta.setBounds(50,200,300,40);
        orange.setBounds(50,250,300,40);

        setLayout(null);
        add(tf);
        add(red);
        add(magneta);
        add(orange);

        red.addAdjustmentListener(this);
        magneta.addAdjustmentListener(this);
        orange.addAdjustmentListener(this);
    }
    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        tf.setBackground(new Color(red.getValue(), magneta.getValue(), orange.getValue()));
    }
}

public class SwingScrollBrDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
