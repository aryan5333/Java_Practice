package swinganimationdemo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;


class MyFrame extends JFrame implements Runnable
{
    int x,y,tx,ty;

    MyFrame()
    {
        super("AnimationDemo");
        x=100;
        y=100;
        tx=ty=1;
       Thread t=new Thread(this);
       t.start();

    }
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval(x,y,100,100);
    }
    public void run()
    {
        while (true) { 
            x+=tx;
            y+=ty;

            if(x<0||x>450)
              tx=tx*-1;
            if(y<0||y>350)
              ty=ty*-1;

              repaint();

              try {
                  Thread.sleep(5);
              } catch (Exception e) {
                 
              }

             
            
        }
    }

    }


public class SwingAnimationDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
