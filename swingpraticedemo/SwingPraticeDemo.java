package swingpraticedemo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{
    JTextField tf;
    JCheckBox c1,c2;
    

    MyFrame()
    {
        super("Practice Demo");
        tf=new JTextField("Demo",20);
        c1=new JCheckBox("Upper");
        c2=new JCheckBox("Lower");

        setLayout(new FlowLayout());
        add(tf);
        add(c1);
        add(c2);
        c1.addActionListener(this);
        c2.addActionListener(this);
    

       


    }
    
    public void actionPerformed(ActionEvent e)
    {
        switch(e.getActionCommand())
        {
            case "Upper":
                tf.setText(tf.getText().toUpperCase());
                break;
            case "Lower":
                tf.setText(tf.getText().toLowerCase());
                break;
        }
    }



}

public class SwingPraticeDemo {
    public static void main(String[] args) {
        {
            MyFrame f=new MyFrame();
            f.setSize(500,500);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    
}
