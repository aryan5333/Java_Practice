package keyevent;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements MouseListener,MouseMotionListener
{
    Label l1,l2;

    MyFrame()
    {
        super("MouseEvent Demo");
        l1=new Label("");
        l2=new Label("");
       

        setLayout(null);
3
        l1.setBounds(10,50,100,20);
        l2.setBounds(30,80,110,20);
       
        add(l1);
        add(l2);
        

        // Add MouseListener and MouseMotionListener to the Frame
        addMouseListener(this);
        addMouseMotionListener(this);
       
    }

    public void mouseClicked(java.awt.event.MouseEvent e)
    {
        l1.setText("Mouse Clicked");
       
    }
    
    public void mouseEntered(java.awt.event.MouseEvent e)
    {
        l1.setText("Mouse Entered");
        
    }
    
    public void mouseExited(java.awt.event.MouseEvent e)
    {
        l1.setText("Mouse Exited");
    }

    public void mousePressed(java.awt.event.MouseEvent e)
    {
        l1.setText("Mouse Pressed");
    }
    public void mouseReleased(java.awt.event.MouseEvent e)
    {
        l1.setText("Mouse Released");
    }
    public void mouseDragged(java.awt.event.MouseEvent e)
    {
        l1.setText("Mouse Dragged");
    }
    public void mouseMoved(java.awt.event.MouseEvent e)
    {
        l1.setText("Mouse Moved");
        l2.setText("(" + e.getX() + "," + e.getY() + ")");
    }
}


public class MouseEventDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);

    }
    
}
