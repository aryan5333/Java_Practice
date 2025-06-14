package listenerclassdemo;
import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame  
{
    TextField tf;
    Button b;
    int count=0;

    MyFrame()
    {
        super("ListenerClass Demo");
        tf=new TextField("0",20);
        b=new Button("Click");
        setLayout(new FlowLayout());

        add(b);
        add(tf);
        b.addActionListener(new MyListener());
    }
    class MyListener implements ActionListener
    {
    
        public void actionPerformed(ActionEvent e)
        {
           count++;
           tf.setText(String.valueOf(count));

    }
}

}

public class ListenerClassDemo {
    public static void main(String[] args) {
       MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
