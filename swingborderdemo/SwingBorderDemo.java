package swingborderdemo;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import javax.swing.border.TitledBorder;

class MyFrame extends JFrame
{
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;

    MyFrame()
    {
        super("SwingBorder Demo");
        l=new JLabel("Name");
        tf=new JTextField(20);
        b=new JButton("Ok");
        p=new JPanel();
        p.add(l);
        p.add(tf);
        p.add(b);

        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),"Login",TitledBorder.CENTER,TitledBorder.ABOVE_TOP);
        p.setBorder(br);
        setLayout(new FlowLayout());
        add(p);
        


    }
}

public class SwingBorderDemo {
    public static void main(String[]args)
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
