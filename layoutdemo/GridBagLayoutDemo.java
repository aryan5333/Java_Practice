package layoutdemo;
import java.awt.*;

class MyGridFrame extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    MyGridFrame()
    {
        super();
        setTitle("GridBagLayout Demo");
        GridBagLayout gb=new GridBagLayout();
        GridBagConstraints gbc=new GridBagConstraints();

        setLayout(gb);
        b1=new Button("ONE");
        b2=new Button("TWO");
        b3=new Button("THREE");
        b4=new Button("FOUR");
        b5=new Button("FIVE");
        //b6=new Button("SIX");

       
        gbc.gridx=1;
        gbc.gridx=1;
        add(b1,gbc);
        gbc.gridx=2;
        gbc.gridx=2;
        add(b2,gbc);
        gbc.gridx=3;
        gbc.gridx=3;
        add(b3,gbc);
        gbc.gridx=4;
        gbc.gridx=4;
        add(b4,gbc);
        gbc.gridx=5;
        gbc.gridx=5;
        add(b5,gbc);
        gbc.gridx=5;
        gbc.gridx=5;
        //add(b6);
    }
}

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        MyGridFrame f=new MyGridFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
}
