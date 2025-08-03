package swingtoolbox;
import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.File;

class MyFrame extends JFrame implements ActionListener
{
    JToolBar t;
    JButton b1,b2,b3,b4,b5,b6,b7;
    JTextArea ta;

    MyFrame()
    {
        super("ToolBoxDemmo");
        t=new JToolBar();

        b1=new JButton(new ImageIcon());
        b2=new JButton(new ImageIcon());
        b3=new JButton(new ImageIcon());
        b4=new JButton(new ImageIcon());
        b5=new JButton(new ImageIcon());
        b6=new JButton(new ImageIcon());
        b7=new JButton(new ImageIcon());

        t.add(b1);
        t.add(b2);
        t.add(b3);
        t.add(new JToolBar.Separator());
        t.add(b4);
        t.add(b5);
        t.add(b6);
        t.add(b7);
        ta=new JTextArea();
        JScrollPane sp=new JScrollPane(ta);
        add(ta,BorderLayout.NORTH);
        add(sp,BorderLayout.CENTER);


        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem m1=new JMenuItem("save");
        JMenuItem m2=new JMenuItem("close");

        file.add(m1);
        file.addSeparator();
        file.add(m2);
        mb.add(file);
        setJMenuBar(mb);
        b2.addActionListener(this);
        m2.addActionListener(this);
        b2.setActionCommand("open");
        b3.setActionCommand("save");



    }
    public void actionPerformed(ActionEvent ae)
    {
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(this);
        File f=fc.getSelectedFile();

        try
        {
            FileInputStream fis=new FileInputStream(f);
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            ta.setText(str);
            fis.close();


        }
        catch(Exception e){}
    }
}

public class SwingToolBoxDemo {
    public static void main(String[]args)
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
