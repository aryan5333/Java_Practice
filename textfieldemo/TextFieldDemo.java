package textfieldemo;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame 
{
    Label l1,l2;
    TextField tf;

     MyFrame()
    {
        super("TextField Demo");

        l1=new Label("No Text is Entered yet ");
        l2=new Label("Enter Key not yet hit");
        tf=new TextField(20);

        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(tf);
         
        handler h=new handler();
        tf.addTextListener(h);
        tf.addActionListener(h);
    }

    

    class handler implements TextListener,ActionListener
    {
        @Override
         public void textValueChanged(TextEvent te)
          {
              l1.setText(tf.getText());
       }

         @Override
          public void actionPerformed(ActionEvent ae)
           {
             l2.setText(tf.getText());
           }

    }
}

public class TextFieldDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();

        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
