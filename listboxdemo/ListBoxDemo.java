package listboxdemo;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener,ActionListener
{
    List l;
    Choice c;
    TextArea ta;

    public MyFrame() 
    {
        super("ListBox Demo");
        l=new List(4,true);
        c=new Choice();
        ta=new TextArea(10,30);
         
        setLayout(new FlowLayout());
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("thursday");
        l.add("friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");
        c.add("May");
         c.add("June");
         c.add("July");
         c.add("August");

         add(l);
         add(c);
         add(ta);
         l.addItemListener(this);
         c.addItemListener(this);
         l.addActionListener(this);




    }
    public void itemStateChanged(ItemEvent ie)
    {
        if(ie.getSource()==l)
        {
            ta.setText(l.getSelectedItem());
        }
        else
        {
            ta.setText(c.getSelectedItem());
        }
    }
    public void actionPerformed(ActionEvent ae)
    {
        String list[]=l.getSelectedItems();

        String txt="";

        for(String x:list)
          txt+=x+"\n";

        ta.setText(txt);
    }
    }

    

    


public class ListBoxDemo {
    public static void main(String[]args)
    {
        MyFrame f=new MyFrame();

        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
