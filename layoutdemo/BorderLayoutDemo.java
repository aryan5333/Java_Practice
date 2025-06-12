package layoutdemo;
import java.awt.*;

class MyFrame extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    MyFrame()
    {
        super("FlowLayout Demo");
        b1=new Button("ONE");
        b2=new Button("TWO");
        b3=new Button("THREE");
        b4=new Button("FOUR");
        b5=new Button("FIVE");
        b6=new Button("SIX");

        

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        add(b6);

        Panel p=new Panel();
        p.setLayout(new GridLayout(3,13));
        p.add(new Button("MON"));
        p.add(new Button("TUE"));
        p.add(new Button("WED"));
        add(p,BorderLayout.EAST);
    }
}

public class BorderLayoutDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
