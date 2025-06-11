package firstapp;
import java.awt.*;

class MyFrame extends Frame
{
    Button b;
    TextField tf;
    Label l;

    public MyFrame()
    {
        super("My App");
        setLayout(new FlowLayout());

        b=new Button("OK");
        l=new Label("Name");
        tf=new TextField(20);

        add(b);
        add(l);
        add(tf);
        

    }
}

public class FirstApp2 {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setVisible(true);
        f.setSize(500,500);
    }
    
}
