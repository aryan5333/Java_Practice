package swingdemo;

import java.awt.*;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{
    JLabel l;
    JButton b;
    int count = 0;

    MyFrame()
    {
        super("Swing Demo");

        setLayout(new FlowLayout());
        l=new JLabel("Clicked "+count+" Times");
        b=new JButton("Click");
        getRootPane().setDefaultButton(b);

        add(l);
        add(b);
        //add(new JButton("Cancel"));
       // b.setIcon(new ImageIcon("File address"));
        b.addActionListener(this);
        b.setToolTipText("counter");

    }
    public void actionPerformed(ActionEvent ae)
    {
        count++;
        l.setText("Clicked "+count+" Times");
    }
}
public class SwingDemo
{
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}