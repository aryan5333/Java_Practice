package layoutdemo;
import java.awt.*;

class MyGridFrame extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    MyGridFrame()
    {
        super("GridLayout Demo");
        setLayout(new GridLayout(3,2));
        b1=new Button("ONE");
        b2=new Button("TWO");
        b3=new Button("THREE");
        b4=new Button("FOUR");
        b5=new Button("FIVE");
        b6=new Button("SIX");

       

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}

public class GridLayoutDemo {
    public static void main(String[] args) {
        MyGridFrame f=new MyGridFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
