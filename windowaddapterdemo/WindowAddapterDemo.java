package windowaddapterdemo;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
    MyFrame()
    {
        super("WindowAddapter Demo");
        addWindowListener(new MyWindowAddapter());
    }
    public void WindowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}

// Define the missing MyWindowAddapter class
class MyWindowAddapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

public class WindowAddapterDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true); 
    }
    
}
