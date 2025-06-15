package menudemo;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener,ItemListener
{
    Menu File,Sub;
    MenuItem save,choose,open,closeAll;

    CheckboxMenuItem auto;

    TextField tf;
    MenuBar mb;

    MyFrame()
    {
        super("MenuDemo2");

        File=new Menu("File");
        Sub=new Menu("Sub");

        save=new MenuItem("Save");
        save.addActionListener(this);
        choose=new MenuItem("choose");
        choose.addActionListener(this);
        open=new MenuItem("Open");
        open.addActionListener(this);
        closeAll=new MenuItem("CloseAll");
        closeAll.addActionListener(this);

        auto=new CheckboxMenuItem("Auto Save");
        auto.addItemListener(this);

        File.add(save);
        File.add(choose);
        File.add(auto);
        File.add(Sub);

        Sub.add(closeAll);
        Sub.add(open);

        tf=new TextField("30");
        add(tf);

        mb=new MenuBar();
        mb.add(File);

        setLayout(new FlowLayout());
        addWindowListener(new MyWindowAddapter());


    }
    public void actionPerformed(ActionEvent ae)
    {
        tf.setText(ae.getActionCommand());
        
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(auto.getState())
        {
            tf.setText("Auto On");
        }
        else
        {
            tf.setText("Auto off");
        }

    }
    class MyWindowAddapter extends WindowAdapter
    {
        public void WindowClosing(WindowEvent we)
        {
            System.exit(0);
        }
    }
}

public class MenuDemotrial {
    public static void main(String[]args)
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
