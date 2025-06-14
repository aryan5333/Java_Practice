package windoweventdemo;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame implements WindowListener
{
    Label l;

    MyFrame()
    {
        super("WindowEvent demo");
        l=new Label("No message from Window");

        setLayout(new FlowLayout());
        add(l);

        addWindowListener(this);
    }
    public void windowActivated(WindowEvent we)
    {
        l.setText("Window Activated");
    }
    public void windowDeactivated(WindowEvent we)
    {
        l.setText("Window Deactivated");
    }
    public void windowOpened(WindowEvent we)
    {
        l.setText("Window Opened");
    }
    public void windowClosed(WindowEvent we)
    {
        l.setText("Window Closed");
    }
    public void windowClosing(WindowEvent we)
    {
        l.setText("Window Closing");
        System.exit(0);
    }
    public void windowIconified(WindowEvent we)
    {
        l.setText("Window Iconified");
    }
    public void windowDeiconified(WindowEvent we)
    {
        l.setText("Window Deiconified");
    }
}

public class WindowEventDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
   
    
}
