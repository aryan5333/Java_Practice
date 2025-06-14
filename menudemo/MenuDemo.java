package menudemo;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener,ItemListener
{
    Menu file,sub;
    MenuItem open,save,close,closeAll;

    CheckboxMenuItem auto;
    
    TextField tf;
    MenuBar mb;

    MyFrame()
    {
        super("Menu Demo");

        file=new Menu("File");
        sub=new Menu("Sub");

        open=new MenuItem("open");
        open.addActionListener(this);
        save=new MenuItem("Save");
        save.addActionListener(this);
        close=new MenuItem("Close");
        close.addActionListener(this);
        closeAll=new MenuItem("CloseAll");
        closeAll.addActionListener(this);

        auto=new CheckboxMenuItem("Auto save");
        auto.addItemListener(this);

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        sub.add(close);
        sub.add(closeAll);

        mb=new MenuBar();
        mb.add(file);
        setMenuBar(mb);
        tf=new TextField(20);

        setLayout(new FlowLayout());
        add(tf);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        tf.setText(e.getActionCommand());
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(auto.getState())
        {
            tf.setText("Auto on");
        }
        else{
            tf.setText("Auto off");
        }
    }


}

public class MenuDemo {
    public static void main(String[]args)
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
