package jtreedemo;
import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
import java.io.File;
import javax.swing.border.Border;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


class Myframe extends JFrame implements TreeSelectionListener
{
    JTree tree;
    JLabel label;

   Myframe()
   {
    super("JTree Demo");
    DefaultMutableTreeNode root=new DefaultMutableTreeNode(" C:\\Users\\sinha");
    File f=new File(" C:\\Users\\sinha");

    for(File x:f.listFiles())
    {
        if(x.isDirectory())
        {
             DefaultMutableTreeNode tem=new DefaultMutableTreeNode(x.getName());
             for(File y:x.listFiles())
             {
                tem.add(new DefaultMutableTreeNode(x.getName()));
             }
             root.add(tem);

        }
        else
        {
            root.add(new DefaultMutableTreeNode(x.getName()));
        }
    }
    tree=new JTree(root);
    label=new JLabel("No Files Selected");
    tree.addTreeSelectionListener(this);

    JScrollBar br=new JScrollBar();

    add(br,BorderLayout.CENTER);
    add(label,BorderLayout.NORTH);


    

   }
   
   public void valueChanged(TreeSelectionEvent e)
   {
    label.setText(e.getPath().toString());
   }

}

public class JTreeDemo {
    public static void main(String[]args)
    {
        Myframe f=new Myframe();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
