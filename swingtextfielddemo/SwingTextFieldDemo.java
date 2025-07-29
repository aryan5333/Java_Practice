package swingtextfielddemo;
import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

class MyFrame extends JFrame
{
    JTextField tf;
    DateFormat df;
    JFormattedTextField ft;

    MyFrame()
    {
        super("SwingTextField Demo");
        tf=new JTextField(20);
        df=new SimpleDateFormat("dd/MM/yyyy");
        ft=new JFormattedTextField(df);
        ft.setColumns(20);
        ft.setValue(0);

        NumberFormat nf=NumberFormat.getInstance();
        
        NumberFormatter nft=new NumberFormatter();
        JFormattedTextField ft2=new JFormattedTextField(nft);
        nft.setAllowsInvalid(false);
        nft.setMaximum(1000);
        ft2.setColumns(20);
        JTextArea jt=new JTextArea(30,30);


        setLayout(new FlowLayout());

        add(tf);
        add(ft);
        add(ft2);
        add(jt);
        add(jt);

        
    }
}

public class SwingTextFieldDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    
}
