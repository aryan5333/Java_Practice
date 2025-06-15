package paintdemo;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame
{
    int x=0,y=0;

    MyFrame()
    {
        super("Paint Demo");
        addMouseListener(new MyMouseAdapter());
        addWindowListener(new MyWindowAddapter());
       

        

    }
    class MyMouseAdapter extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e)
        {
            x=e.getX();
            y=e.getY();
            repaint();
        }
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(x, y, 200,100);
        g.setFont(new Font("Arial",Font.BOLD,50));
        g.drawString("Hello",x,y);
    }
    class MyWindowAddapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
}

public class PaintDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);

    }
    
}
