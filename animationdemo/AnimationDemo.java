package animationdemo;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.*;

class MyFrame extends Frame implements Runnable
{
    int x,y,tx,ty;

    MyFrame()
    {
        //super("Animation demo");
        x=100;
        y=100;
        tx=ty=1;
        Thread t=new Thread(this);
        t.start();
        
    }
     public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillOval(x,y,80,80);
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

            try{Thread.sleep(5);}catch(Exception e){}

            
        }
    }

}


public class AnimationDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,400);
        f.setVisible(true);
    }
    
}
