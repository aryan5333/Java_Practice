package swinglayereddemo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
// import org.w3c.dom.events.MouseEvent; // Removed incorrect import
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;

class MyFrame extends JFrame implements ActionListener 

{
    JLabel l1,l2,l3,l4;
    JRadioButton r1,r2,r3;

    JLayeredPane p;
    
    MyFrame()
    {
        super("Layered Demo");
        r1=new JRadioButton("RED");
        r2=new JRadioButton("GREEN");
        r3=new JRadioButton("BLUE",true);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        JPanel p1=new JPanel();
        p1.add(r1);
        p1.add(r2);
        p1.add(r3);

        l1=new JLabel();
        l1.setBounds(10,10,100,100);
        l1.setBackground(Color.RED);
        l1.setOpaque(true);

        l2=new JLabel();
        l2.setBounds(50,50,250,250);
        l2.setBackground(Color.GREEN);
        l2.setOpaque(true);

        l3=new JLabel();
        l3.setBounds(70,70,300,300);
        l3.setBackground(Color.BLUE);
        l3.setOpaque(true);

        l4=new JLabel();
        l4.setBounds(100,100,150,150);
        l4.setBackground(Color.BLACK);
        l4.setOpaque(true);

        p=new JLayeredPane();
        p.add(l1,new Integer(0));
        p.add(l2,new Integer(1));
        p.add(l3,new Integer(2));
        p.add(l4,new Integer(3));

        add(p1,BorderLayout.NORTH);
        add(p,BorderLayout.CENTER);

        addMouseMotionListener( new MouseAdapter (){
            public void mouseMoved(MouseEvent me)
            {
                l4.setLocation(me.getX(),me.getY());
            }
        });






    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(r1.isSelected())
             p.setLayer(l4,1);
        if(r2.isSelected())
             p.setLayer(l4,2);
        if(r3.isSelected())
            p.setLayer(l4,3);
    }
}

public class SwingLayeredDemo {
    public static void main(String[]args)
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
