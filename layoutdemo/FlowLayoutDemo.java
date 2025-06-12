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

        FlowLayout fl=new FlowLayout();
        fl.setAlignment(FlowLayout.RIGHT);
        setLayout(fl);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}

public class FlowLayoutDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
