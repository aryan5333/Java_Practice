package swingborderdemo;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.Color;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.Border;


class MyFrame extends JFrame
{
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;

    MyFrame()
    {
        l=new JLabel("Name");
        tf=new JTextField(40);
        b=new JButton("Done");
        p=new JPanel();

        p.add(l);
        p.add(tf);
        p.add(b);
        // Removed: p.add(p); // Do not add panel to itself

        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 1), "Login", TitledBorder.CENTER, TitledBorder.ABOVE_TOP);
        p.setBorder(br);
        setLayout(new FlowLayout());
        add(p);
    }
}

public class SwingBorderDemo2
{
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}