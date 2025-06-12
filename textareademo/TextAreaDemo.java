package textareademo;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    MyFrame()
    {
        super("TextArea Demo");
        ta=new TextArea(10,30);
        tf=new TextField(20);
        l=new Label("no Text is Entered yet");
        b=new Button("click");

        setLayout(new FlowLayout());
        add(ta);
        add(tf);
        add(l);
        add(b);
        b.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        //l.setText(ta.getSelectedText());
        ta.append(tf.getText());
        //ta.insert(tf.getText(), ta.getCaretPosition());
    }
}

public class TextAreaDemo {
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500, 500);
        f.setVisible(true);

    }
    
}
