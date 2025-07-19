package keyevent;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

class MyFrame extends Frame implements KeyListener
{
    Label l1,l2,l3,l4;

    MyFrame()
    {
        super("TextEvent Demo");
        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");

        setLayout(null);

        l1.setBounds(30,20,100,20);
        l2.setBounds(30,50,100,20);
        l3.setBounds(30,80,100,20);
        l4.setBounds(30,110,200,20);

        add(l1);
        add(l2);
        add(l4);

        // Add KeyListener to the Frame
        addKeyListener(this);
    }

    public void keyPressed(java.awt.event.KeyEvent ke)
    {
        l1.setText("Key Pressed");
        l2.setText("");
    }
    
    public void keyReleased(java.awt.event.KeyEvent ke)
    {
        l2.setText("Key Released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }
    
    public void keyTyped(java.awt.event.KeyEvent ke)
    {
        l3.setText("KeyTyped");
        
    }
}


public class KeyEvent {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);

    }
    
}
