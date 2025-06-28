package swingsplitdemo;
import java.awt.Color;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyFrame extends JFrame implements ListSelectionListener
{
    JSplitPane sp;
    JLabel lb;
    JList l;

    MyFrame()
    {
        super("SwingListDemo");
        String cols[]={"RED","GREEN","BLUE","YELLOW","MAGNETA","ORANGE","BLACK"};
        l=new JList(cols);
        l.setSelectedIndex(0);
        l.addListSelectionListener(this);
        
        JScrollPane sb1=new JScrollPane(l);
        lb=new JLabel();
        lb.setBackground(Color.GREEN);
        lb.setOpaque(true);
        JScrollPane sb2=new JScrollPane(lb);
        
        sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,sb1,sb2);
        sp.setDividerLocation(200);
        add(sp);
        //JTabbedPane tb=new JTabbedPane();
        //tb.addTab("Colors",sb1);
        //tb.addTab("Label",sb2);
        //add(tb);
    }
    public void valueChanged(ListSelectionEvent e)
    {
        String str=(String)l.getSelectedValue();

        switch(str)
        {
            case "RED": lb.setBackground(Color.RED);
                        break;
            case "GREEN": lb.setBackground(Color.GREEN);
                        break;
            case "BLUE": lb.setBackground(Color.BLUE);
                        break;
            case "YELLOW": lb.setBackground(Color.YELLOW);
                        break;
            case "MAGNETA": lb.setBackground(Color.MAGENTA);
                        break;
            case "ORANGE": lb.setBackground(Color.ORANGE);
                        break;
            case "BLACK": lb.setBackground(Color.BLACK);
                        break;
            default: lb.setBackground(Color.WHITE);
                        break;
        }
    }
}

public class SwingSplitDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(800,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
